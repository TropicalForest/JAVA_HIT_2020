import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataController {
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private PrintWriter printWriter;
    private Scanner scanner;
	
	
    public void OpenFileToWrite(String fileName){
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CloseFileAfterWrite(){
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void OpenFileToRead(String fileName){
        try {
            scanner = new Scanner(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CloseFileAfterRead(){
        scanner.close();
    }
    
    
    public void WriteAccountToFile(String fileName, Accounts account){
        OpenFileToWrite(fileName);
        printWriter.println(account.getId() + "|" + account.getFullName() + "|" + account.getUsername() + "|" +
                account.getPassword() + "|" + account.getEmail() + "|" + account.getPhone() + "|" +
                account.getCreateAt());
        CloseFileAfterWrite();
    }
    
    public List<Accounts> ReadAccountsFromFile(String fileName){
        OpenFileToRead(fileName);
        List<Accounts> list = new ArrayList<>();
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            Accounts account = CreateAccountFromData(data);
            list.add(account);
        }
        CloseFileAfterRead();
        return list;
    }

    private Accounts CreateAccountFromData(String data) {
        String[] datas = data.split("\\|");
        Accounts account = new Accounts(Long.parseLong(datas[0]), datas[1], datas[2], datas[3], datas[4],
                datas[5], datas[6]);
        return account;
    }

    public void UpdateAccountFile(List<Accounts> list, String fileName){
        File file = new File(fileName);
        if (file.exists()){
            file.delete();
        }
        OpenFileToWrite(fileName);
        for (Accounts account: list){
            printWriter.println(account.getId() + "|" + account.getFullName() + "|" + account.getUsername() + "|" +
                    account.getPassword() + "|" + account.getEmail() + "|" + account.getPhone() + "|" +
                    account.getCreateAt());
        }
        CloseFileAfterWrite();
    }
    
    
    
}
 	