import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class RunMain {

    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    static Date date;
    static Pattern pattern;

    static DataController dataController = new DataController();
    static List<Accounts> list = new ArrayList<>();

    static final String REGEX_USERNAME = "^[a-zA-Z0-9]{6,}$";
    static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
    static final String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    static final String REGEX_PHONE = "^[0-9\\-\\+]{9,15}$";

    static final String ACCOUNT_FILE_NAME = "ACC.DAT";

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Create new account.");
            System.out.println("2. Login to an existing account.");
            System.out.println("3. Sort accounts by username.");
            System.out.println("4. Exit.");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    CreateNewAccount();
                    break;
                case 2:
                    Login();
                    break;
                case 3:
                    list = dataController.ReadAccountsFromFile(ACCOUNT_FILE_NAME);
                    Collections.sort(list, new SortAccountsByUsername());
                    dataController.UpdateAccountFile(list, ACCOUNT_FILE_NAME);
                    for (Accounts account : list){
                        System.out.println(account);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (true);
    }

    private static void CreateNewAccount() {
        long id;
        String fullName, username, password, rePassword, email, phone, createAt;
        boolean checkExistsId, checkExistsUsername, isUsername, isPassword, isEmail, isPhone;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLong();

            checkExistsId = CheckExistsId(id);
            if (checkExistsId){
                System.out.println("Id already exist");
            }
        }while (checkExistsId);

        scanner.nextLine();
        System.out.print("Input fullName: ");
        fullName = scanner.nextLine();

        do {
            System.out.print("Input username: ");
            username = scanner.nextLine();
            pattern = Pattern.compile(REGEX_USERNAME);
            isUsername = pattern.matcher(username).find();

            checkExistsUsername = CheckExistsUsername(username);

            if (!isUsername){
                System.out.println("Invalid username");
            } else {
                if (checkExistsUsername){
                    System.out.println("Username already exists");
                }
            }
        }while (checkExistsUsername);

        do {
            System.out.print("Input password: ");
            password = scanner.nextLine();

            System.out.print("Confirm password: ");
            rePassword = scanner.nextLine();

            pattern = Pattern.compile(REGEX_PASSWORD);
            isPassword = pattern.matcher(password).find();

            if (!isPassword){
                System.out.println("Invalid password");
            } else {
                if (password.compareTo(rePassword) != 0){
                    System.out.println("Password and confirm password does not match");
                } else {
                    break;
                }
            }
        }while (true);

        do {
            System.out.print("Input email: ");
            email = scanner.nextLine();
            pattern = Pattern.compile(REGEX_EMAIL);
            isEmail = pattern.matcher(email).find();
            if (!isEmail){
                System.out.println("Invalid email");
            } else {
                break;
            }
        }while (true);

        do {
            System.out.print("Input phone: ");
            phone = scanner.nextLine();
            pattern = Pattern.compile(REGEX_PHONE);
            isPhone = pattern.matcher(phone).find();
            if (!isPhone){
                System.out.println("Invalid phone");
            } else {
                break;
            }
        }while (true);

        date = new Date();
        createAt = simpleDateFormat.format(date);

        Accounts account = new Accounts(id, fullName, username, password, email, phone, createAt);
        dataController.WriteAccountToFile(ACCOUNT_FILE_NAME, account);
    }

    private static void Login(){
        list = dataController.ReadAccountsFromFile(ACCOUNT_FILE_NAME);
        int choice;
        String username;
        String password;
        boolean checkExistsAccount = false;

        System.out.print("Username: ");
        scanner.nextLine();
        username = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();

        checkExistsAccount = CheckExistsAccount(username, password);

        if (checkExistsAccount){
            Accounts account = GetAccountByUsername(username);
            System.out.println("Login success");
            do {
                System.out.println("1. Show info.");
                System.out.println("2. Change password.");
                System.out.println("3. Log out.");

                System.out.print("Your choice: ");
                choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        System.out.println(account);
                        break;
                    case 2:
                        ChangePassword(username, password, account);
                        break;
                    case 3:
                        return;
                }
            }while (true);
        } else {
            System.out.println("Account does not exist.");
        }
    }

    private static void ChangePassword(String username, String oldPassword, Accounts account) {
        String reOldPassword, password, rePassword;
        boolean isPassword;
        scanner.nextLine();
        do {
            System.out.print("Input old password: ");
            reOldPassword = scanner.nextLine();

            System.out.print("Input new password: ");
            password = scanner.nextLine();

            System.out.print("Confirm new password: ");
            rePassword = scanner.nextLine();

            pattern = Pattern.compile(REGEX_PASSWORD);
            isPassword = pattern.matcher(password).find();

            if (reOldPassword.compareTo(oldPassword) != 0){
                System.out.println("Old Password and password does not match");
            } else {
                if (!isPassword){
                    System.out.println("Invalid password");
                } else {
                    if (password.compareTo(rePassword) != 0){
                        System.out.println("Password and confirm password does not match");
                    } else {
                        break;
                    }
                }
            }
        }while (true);

        account.setPassword(password);

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getUsername().compareTo(username) == 0){
                list.set(i, account);
                break;
            }
        }
        dataController.UpdateAccountFile(list, ACCOUNT_FILE_NAME);
    }

    private static Accounts GetAccountByUsername(String username) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getUsername().compareTo(username) == 0){
                return list.get(i);
            }
        }
        return null;
    }

    private static boolean CheckExistsAccount(String username, String password) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getUsername().compareTo(username) == 0 &&
                    list.get(i).getPassword().compareTo(password) == 0){
                return true;
            }
        }
        return false;
    }

    private static boolean CheckExistsId(long id) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }

    private static boolean CheckExistsUsername(String username) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getUsername().compareTo(username) == 0){
                return true;
            }
        }
        return false;
    }
}