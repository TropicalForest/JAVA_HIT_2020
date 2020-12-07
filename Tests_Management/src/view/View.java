package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.DataController;
import controller.DataUtility;
import model.Student;
import model.Teacher;
import model.Test;
import model.Test_Management;



public class View {
	public static boolean checkExistTeacher(ArrayList<Teacher> examinerList, int teacherID) {
		for(Teacher t : examinerList) 
			if(t.getteacherID() == teacherID)
					return false;
		return true;
	}
	public static boolean checkExistStudent(ArrayList<Student> studentList, int StudentID) {
		for(Student s : studentList) 
			if(s.getstudentID()==StudentID)
				return false; 
		return true; 
	}
	public static boolean checkExistTest(ArrayList<Test> testList, int examCode) {
		for(Test s : testList) 
			if(s.getexamCode()==examCode)
				return false; 
		return true; 
	}
	public static void setTestMngtCode(ArrayList<Test_Management> testMngtList, int test_mngt_code) {
		if(testMngtList.isEmpty()) 
			test_mngt_code=1000;
		else {
			for(Test_Management s : testMngtList) 
				if(s.getTest_management_code() == test_mngt_code) 
					test_mngt_code = setNewTestMngtCode(testMngtList);
		}	
	}
	public static int setNewTestMngtCode(ArrayList<Test_Management> testMngtList) {
		int max = testMngtList.get(0).getTest_management_code();
		for(Test_Management s : testMngtList) 
			if(s.getTest_management_code() > max) {
				max = s.getTest_management_code();
			}
		return max+1;
	}
	
	public static int getIdxStudent(ArrayList<Student> studentList, int StudentID) {
		for(int i = 0; i < studentList.size(); ++i) 
			if(studentList.get(i).getstudentID()==StudentID)
				return i;
		return -1;
	}
	public static int getIdxTeacher(ArrayList<Teacher> examinerList, int TeacherID) {
		for(int i = 0; i < examinerList.size(); ++i) 
			if(examinerList.get(i).getteacherID()==TeacherID)
				return i;
		return -1;
	}
	public static int getIdxTest(ArrayList<Test> testList, int examCode) {
		for(int i = 0; i < testList.size(); ++i) 
			if(testList.get(i).getexamCode() == examCode)
				return i;
		return -1;
	}
	public static void ShowListStudent(DataController dataController, String filename) {
		ArrayList<Student> studentList = dataController.ReadStudentFromFile(filename);
		for(Student student : studentList) 
			System.out.println(student);
	}
	public static void ShowListTeacher(DataController dataController, String filename) {
		ArrayList<Teacher> examinerList = dataController.ReadTeacherFromFile(filename);
		for(Teacher teacher : examinerList) 
			System.out.println(teacher);
	}
	public static void ShowListTest(DataController dataController, String filename) {
		ArrayList<Test> testList = dataController.ReadTestFromFile(filename);
		for(Test test : testList) 
			System.out.println(test);
	}
	public static void ShowListTestMngt(DataController dataController, String filename) {
		ArrayList<Test_Management> testMngtList = dataController.ReadTestMngtFromFile(filename);
		for(Test_Management testMngt : testMngtList) 
			System.out.println(testMngt);
	}
	

	private final static String regexExamCode = "^[0-9]{4,}$";
	private final static String regexSubjectCode = "^[0-9]{5,}$";
	private final static String regexStudentID = "^[0-9]{6,}$";
	private final static String regexTeachertID = "^[0-9]{6,}$";
	private final static String regexViolatingRules = "^(yes|no)$";
	private final static String StudentFilename = "STUDENT.DAT";
	private final static String TeacherFilename = "EXAMINER.DAT";
	private final static String TestFilename = "TEST.DAT";
	private final static String TestsMngtFilename = "TESTS_MNGT.DAT";
	
	
	public static void main(String[] args) {

		
		DataController dataController = new DataController();
		DataUtility dataUtility = new DataUtility();
		
		ArrayList<Student> studentList;
		ArrayList<Teacher> examinerList;
		ArrayList<Test> testList;
		ArrayList<Test_Management> testMngtsList;
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
            System.out.println("----------------------------------------MENU----------------------------------------");
            System.out.println("1. Add student");
            System.out.println("2. Show list student");
            System.out.println("3. Edit list student");
            System.out.println("4. Add examiner");
            System.out.println("5. Show list examiner");
            System.out.println("6. Edit list examiner");
            System.out.println("7. Add test");
            System.out.println("8. Show list test");
            System.out.println("9. Edit list test");
            System.out.println("10. Creat a test management");
            System.out.println("11. Show list test management");
            System.out.println("12. Sort list student");
            System.out.println("13. Sort list examiner");
            System.out.println("14. Sort list test");
            System.out.println("15. Search student");
            System.out.println("16. Search examiner");
            System.out.println("17. Search test");
            System.out.println("18. Manage test management");
            System.out.println("0. Exit");
        
            
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            
            switch (choice) {
            case 0:
            	return;
			case 1:
				studentList = dataController.ReadStudentFromFile(StudentFilename);
				int studentID, yearCourse;
				String studentName, classOfStudent;
				boolean checkStudentID=false;
				do {
					System.out.println("Nhập mã sinh viên: ");
					studentID = scanner.nextInt();
					scanner.nextLine();
					if(String.valueOf(studentID).matches(regexStudentID)) {
						if(!checkExistStudent(studentList, studentID)) {
							System.out.println("MSV đã tồn tại!");
							checkStudentID = checkExistStudent(studentList, studentID);
						}
						else
							break;
					} else 
						System.out.println("MSV chỉ chứa số, tối thiểu 6 số!");
					
				}while(checkStudentID);
				System.out.println("Nhập họ tên sinh viên: ");
				studentName = scanner.nextLine();
				System.out.println("Lớp: ");
				classOfStudent = scanner.nextLine();
				System.out.println("Khóa: ");
				yearCourse = scanner.nextInt();
				scanner.nextLine();
				Student student = new Student(studentID, studentName, classOfStudent, yearCourse);
				studentList.add(student);
				dataController.WriteStudentToFile(StudentFilename, student);
				break;
				
				
				
				
				
			case 2:
				ShowListStudent(dataController,StudentFilename);
				break;
				
				
				
				
			case 3:
				studentList = dataController.ReadStudentFromFile(StudentFilename);
				int editStudentChoice,editStudentID,newYearCourse;
				String newStudentName, newClass;
				int idxEditStudent;
				do {
					ShowListStudent(dataController,	StudentFilename);
					System.out.println("Nhập mã sinh viên của sinh viên cần sửa thông tin: ");
					editStudentID = scanner.nextInt();
					scanner.nextLine();
					idxEditStudent = getIdxStudent(studentList, editStudentID);
					if(idxEditStudent!=-1)
						break;
					else
						System.out.println("Không tồn tại MSV, nhập lại!");
				}while(idxEditStudent!=-1);
				
				do {
					System.out.println("1. Sửa tên");
					System.out.println("2. Sửa lớp");
					System.out.println("3. Sửa khóa" );
					System.out.println("Enter your choice: ");
					editStudentChoice = scanner.nextInt();
					scanner.nextLine();
					if(editStudentChoice<=0 || editStudentChoice>3)
						System.out.println("Sai lựa chọn, mời nhập lại!");
				} while(editStudentChoice<=0 || editStudentChoice>3);
				
				
				switch (editStudentChoice) {
				case 1:
					System.out.println("Nhập tên mới: ");
					newStudentName = scanner.nextLine();
					studentList.get(idxEditStudent).setName(newStudentName);
					break;
				case 2:
					System.out.println("Nhập lớp mới: ");
					newClass = scanner.nextLine();
					studentList.get(idxEditStudent).setClassOfStudent(newClass);
					break;
				case 3:
					System.out.println("Nhập khóa mới: ");
					newYearCourse = scanner.nextInt();
					scanner.nextLine();
					studentList.get(idxEditStudent).setYearCourse(newYearCourse);
					break;
				}
				dataController.UpdateFileDATA_STUDENT(studentList, StudentFilename);
				break;
				
				
				
				
				
				
				
			case 4:
				examinerList = dataController.ReadTeacherFromFile(TeacherFilename);
				int teacherID;
				String teacherName;
				boolean checkTeacherID=false;
				do {
					System.out.println("Nhập mã GV: ");
					teacherID = scanner.nextInt();
					scanner.nextLine();
					if(String.valueOf(teacherID).matches(regexTeachertID)) {
						if(!checkExistTeacher(examinerList, teacherID)) {
							System.out.println("MGV đã tồn tại!");
							checkTeacherID = checkExistTeacher(examinerList, teacherID);
						}
						else
							break;
					} else 
						System.out.println("MGV chỉ chứa số, tối thiểu 6 số!");
		
				}while(checkTeacherID);
				System.out.println("Nhập họ tên GV: ");
				teacherName = scanner.nextLine();
				Teacher teacher = new Teacher(teacherName, teacherID);
				examinerList.add(teacher);
				dataController.WriteTeacherToFile(TeacherFilename, teacher);
				break;
				
				
				
				
				
				
				
				
				
			case 5:
				ShowListTeacher(dataController, TeacherFilename);
				break;
				
				
				
				
				
				
				
				
			case 6:
				examinerList = dataController.ReadTeacherFromFile(TeacherFilename);
				int editTeacherID;
				String newTeacherName;
				int idxEditTeacher;
				do {
					ShowListTeacher(dataController, TeacherFilename);
					System.out.println("Nhập mã GV của GV cần sửa thông tin: ");
					editTeacherID = scanner.nextInt();
					scanner.nextLine();
					idxEditTeacher = getIdxTeacher(examinerList, editTeacherID);
					if(idxEditTeacher!=-1)
						break;
					else
						System.out.println("Không tồn tại MGV, nhập lại!");
				}while(idxEditTeacher!=-1);
				
				System.out.println("Nhập tên của GV có MGV "+editTeacherID+": " );
				newTeacherName = scanner.nextLine();
				examinerList.get(idxEditTeacher).setName(newTeacherName);
				dataController.UpdateFileDATA_EXAMINER(examinerList, StudentFilename);
				break;
					
				
				
				
			
				
				
			case 7:
				testList = dataController.ReadTestFromFile(TestFilename);
				int examCode,amountOfQuestion,subjectCode;
				String subject;

				boolean checkExamCode=false;
				do {
					System.out.println("Nhập mã đề: ");
					examCode = scanner.nextInt();
					scanner.nextLine();
					if(String.valueOf(examCode).matches(regexExamCode)) {
						if(!checkExistTest(testList, examCode)) {
							System.out.println("Mã đề đã tồn tại!");
							checkExamCode = checkExistTest(testList, examCode);
						}
						else
							break;
					} else 
						System.out.println("Mã đề chỉ chứa số, tối thiểu 4 số!");
					
				}while(checkExamCode);
				
				do {
					System.out.println("Nhập số lượng câu hỏi");
					amountOfQuestion = scanner.nextInt();
					scanner.nextLine();
					if(amountOfQuestion < 0)
						System.out.println("Số lượng câu hỏi âm ????????");
				} while(amountOfQuestion<0);

				
				do {
					System.out.println("Nhập mã môn thi: ");
					subjectCode = scanner.nextInt();
					scanner.nextLine();
					if(!String.valueOf(subjectCode).matches(regexSubjectCode))
						System.out.println("Chỉ nhập số, tối thiểu 5 số!");
				}while(!String.valueOf(subjectCode).matches(regexSubjectCode));
				System.out.println("Nhập tên môn thi: ");
				subject = scanner.nextLine();
				Test test = new Test(examCode, amountOfQuestion, subject, subjectCode);
				testList.add(test);
				dataController.WriteTestToFile(TestFilename, test);
				break;
				
				
				
				
				
				
				
				
			case 8:
				ShowListTest(dataController, TestFilename);
				break;
				
			
				
				
				
				
				
			case 9:
				testList = dataController.ReadTestFromFile(TestFilename);
				int editExamCode, newAmountOfQuestion, newSubjectCode;
				String newSubject;
				int idxEditTest;
				do {
					ShowListTest(dataController, TestFilename);
					System.out.println("Nhập mã đề của đề thi cần sửa thông tin: ");
					editExamCode = scanner.nextInt();
					scanner.nextLine();
					idxEditTest = getIdxTest(testList, editExamCode);
					if(idxEditTest!=-1)
						break;
					else
						System.out.println("Không tồn tại mã đề thi, nhập lại!");
				}while(idxEditTest!=-1);
				
				do {
					System.out.println("Nhập số lượng câu hỏi");
					newAmountOfQuestion = scanner.nextInt();
					scanner.nextLine();
					if(newAmountOfQuestion < 0)
						System.out.println("Số lượng câu hỏi âm ????????");
				} while(newAmountOfQuestion<0);

				
				do {
					System.out.println("Nhập mã môn thi: ");
					newSubjectCode = scanner.nextInt();
					scanner.nextLine();
					if(!String.valueOf(newSubjectCode).matches(regexSubjectCode))
						System.out.println("Chỉ nhập số, tối thiểu 5 số!");
				}while(!String.valueOf(newSubjectCode).matches(regexSubjectCode));
				
				System.out.println("Nhập tên môn thi: ");
				newSubject = scanner.nextLine();
				
				testList.get(idxEditTest).setexamCode(editExamCode);
				testList.get(idxEditTest).setAmountOfQuestion(newAmountOfQuestion);
				testList.get(idxEditTest).setSubject(newSubject);
				testList.get(idxEditTest).setSubjectCode(newSubjectCode);
				dataController.UpdateFileDATA_TEST(testList, TestFilename);
				break;
				
				
			
				
				
				
			case 10:
				studentList = dataController.ReadStudentFromFile(StudentFilename);
				examinerList = dataController.ReadTeacherFromFile(TeacherFilename);
				testList = dataController.ReadTestFromFile(TestFilename);
				testMngtsList = dataController.ReadTestMngtFromFile(TestsMngtFilename);
				
				
				int testMngt_studentID, testMngt_teacherID, testMngt_examCode,mark;
				String violatingRules;
				int checkIdxStudent, checkIdxTeacher, checkIdxTest;
				int test_mngt_code = 0;
				
				do {
					ShowListStudent(dataController, StudentFilename);
					System.out.println("Nhập MSV của thí sinh: ");
					testMngt_studentID=scanner.nextInt();
					scanner.nextLine();
					if(checkExistStudent(studentList,testMngt_studentID))
						System.out.println("MSV không tồn tại!");	
				}while(checkExistStudent(studentList,testMngt_studentID));
				checkIdxStudent = getIdxStudent(studentList, testMngt_studentID);
				
				
				do {
					ShowListTeacher(dataController, TeacherFilename);
					System.out.println("Nhập MGV của GV: ");
					testMngt_teacherID=scanner.nextInt();
					scanner.nextLine();			
					if(checkExistTeacher(examinerList,testMngt_teacherID))
						System.out.println("MGV không tồn tại!");	
				}while(checkExistTeacher(examinerList,testMngt_teacherID));
				checkIdxTeacher = getIdxTeacher(examinerList, testMngt_teacherID);
				
				do {
					ShowListTest(dataController, TestFilename);
					System.out.println("Nhập mã đề của đề thi: ");
					testMngt_examCode=scanner.nextInt();
					scanner.nextLine();			
					if(checkExistTest(testList,testMngt_examCode))
						System.out.println("Mã đề không tồn tại!");	
				}while(checkExistTest(testList,testMngt_examCode));
				checkIdxTest = getIdxTest(testList, testMngt_examCode);
				
				
				do {
					System.out.println("Nhập vào điểm số của bài thi: ");
					mark = scanner.nextInt();
					
					if(mark<0 || mark>10)
						System.out.println("Điểm không hợp lệ!");
				}while(mark<0 || mark>10);
				
				
				do {
					System.out.println("Đánh dấu bài(yes/no): ");
					violatingRules = scanner.nextLine();
					if(!String.valueOf(violatingRules.toLowerCase()).matches(regexViolatingRules))
						System.out.println("Chỉ có 2 tình trạng yes/no !");
				}while(!String.valueOf(violatingRules.toLowerCase()).matches(regexViolatingRules));
				setTestMngtCode(testMngtsList, test_mngt_code);
		
				
				Test_Management testMngt = new Test_Management(studentList.get(checkIdxStudent), examinerList.get(checkIdxTeacher),testList.get(checkIdxTest),test_mngt_code,mark,violatingRules.toLowerCase());
				testMngtsList = dataUtility.UpdateTestMngt(testMngtsList, testMngt);
				dataController.UpdateFileDATA_TEST_MNGNT(testMngtsList, TestsMngtFilename);
				break;
			
				
				
				
			case 11:
				ShowListTestMngt(dataController, TestsMngtFilename);
				break;
				
				
				
				
				
				
			case 12:
				studentList = dataController.ReadStudentFromFile(StudentFilename);
				dataUtility.SortStudentByID(studentList);
				dataController.UpdateFileDATA_STUDENT(studentList, StudentFilename);
				ShowListStudent(dataController, StudentFilename);
				break;
				
				
				
				
				
			case 13:
				examinerList = dataController.ReadTeacherFromFile(TeacherFilename);
				dataUtility.SortTeacherByID(examinerList);
				dataController.UpdateFileDATA_EXAMINER(examinerList, TeacherFilename);
				ShowListTeacher(dataController, TeacherFilename);
				break;
				
				
				
				
				
			case 14:
				testList = dataController.ReadTestFromFile(TestFilename);
				dataUtility.SortTestByID(testList);
				dataController.UpdateFileDATA_TEST(testList, TestFilename);
				ShowListTest(dataController, TestFilename);
				break;	
				
				
				
				
				
			case 15:
				studentList = dataController.ReadStudentFromFile(StudentFilename);
				int searchStudentChoice;
				do {
					ShowListStudent(dataController, StudentFilename);
					System.out.println("1.Tìm kiếm theo họ tên");
					System.out.println("2.Tìm kiếm theo id");
					System.out.println("3.Tìm kiếm theo lớp");
					System.out.println("4.Tìm kiếm theo khóa");
					System.out.println("Enter your choice: ");
					searchStudentChoice = scanner.nextInt();
					scanner.nextLine();
					if(searchStudentChoice<1 && searchStudentChoice>4)
						System.out.println("Không có lựa chọn "+searchStudentChoice);
				} while(searchStudentChoice<1 && searchStudentChoice>4);
				switch (searchStudentChoice) {
					case 1:
						System.out.println("Nhập vào tên sinh viên cần tìm: ");
						String searchStudentName = scanner.nextLine();
						if(dataUtility.SearchStudentByName(studentList, searchStudentName).isEmpty())
							System.out.println("Không có sinh viên có tên "+ searchStudentName);
						else
							System.out.println(dataUtility.SearchStudentByName(studentList, searchStudentName));
						break;
					case 2:
						System.out.println("Nhập vào id sinh viên cần tìm: ");
						int searchStudentId = scanner.nextInt();
						if(checkExistStudent(studentList, searchStudentId))
							System.out.println("Không có sinh viên có id" + searchStudentId);
						else
							for(Student st : studentList)
								if(st.getstudentID() == searchStudentId)
									System.out.println(st);
						break;
					case 3:
						System.out.println("Nhập vào lớp của sinh viên cần tìm: ");
						String searchStudentClass = scanner.nextLine();
						if(dataUtility.SearchStudentByClass(studentList, searchStudentClass).isEmpty())
							System.out.println("Không có sinh viên trong lớp "+ searchStudentClass);
						else
							System.out.println(dataUtility.SearchStudentByClass(studentList, searchStudentClass));
						break;
					case 4:
						System.out.println("Nhập vào niên khóa của sinh viên cần tìm: ");
						int searchStudentYearCourse = scanner.nextInt();
						if(dataUtility.SearchStudentByYearCourse(studentList, searchStudentYearCourse).isEmpty())
							System.out.println("Không có sinh viên khóa "+ searchStudentYearCourse);
						else
							System.out.println(dataUtility.SearchStudentByYearCourse(studentList, searchStudentYearCourse));
						break;
				}
				break;
				
			
			case 16:
				examinerList = dataController.ReadTeacherFromFile(TeacherFilename);
				int searchTeacherChoice;
				do {
					ShowListTeacher(dataController, TeacherFilename);
					System.out.println("1.Tìm kiếm theo họ tên");
					System.out.println("2.Tìm kiếm theo id");
					System.out.println("Enter your choice: ");
					searchTeacherChoice = scanner.nextInt();
					scanner.nextLine();
					if(searchTeacherChoice<1 && searchTeacherChoice>2)
						System.out.println("Không có lựa chọn "+searchTeacherChoice);
				} while(searchTeacherChoice<1 && searchTeacherChoice>2);
				switch (searchTeacherChoice) {
					case 1:
						System.out.println("Nhập vào tên GV cần tìm: ");
						String searchTeacherName = scanner.nextLine();
						if(dataUtility.SearchTeacherByName(examinerList, searchTeacherName).isEmpty())
							System.out.println("Không có GV có tên "+ searchTeacherName);
						else
							System.out.println(dataUtility.SearchTeacherByName(examinerList, searchTeacherName));
						break;
					case 2:
						System.out.println("Nhập vào id GV cần tìm: ");
						int searchTeacherId = scanner.nextInt();
						if(checkExistTeacher(examinerList, searchTeacherId))
							System.out.println("Không có GV có id" + searchTeacherId);
						else
							for(Teacher tc : examinerList)
								if(tc.getteacherID() == searchTeacherId)
									System.out.println(tc);
						break;
					
				}
				break;	
				
				
			case 17:
				testList = dataController.ReadTestFromFile(TestFilename);
				int searchTestChoice;
				do {
					ShowListTest(dataController, TestFilename);
					System.out.println("1.Tìm kiếm theo mã đề");
					System.out.println("2.Tìm kiếm theo môn học");
					System.out.println("3.Tìm kiếm theo mã môn học");
					System.out.println("Enter your choice: ");
					searchTestChoice = scanner.nextInt();
					scanner.nextLine();
					if(searchTestChoice<1 && searchTestChoice>3)
						System.out.println("Không có lựa chọn "+searchTestChoice);
				} while(searchTestChoice<1 && searchTestChoice>3);
				switch (searchTestChoice) {
					case 1:
						System.out.println("Nhập vào mã đề cần tìm: ");
						int searchExamCode = scanner.nextInt();
						if(dataUtility.SearchTestByExamCode(testList, searchExamCode).isEmpty())
							System.out.println("Không có đề thi có mã đề "+ searchExamCode);
						else
							System.out.println(dataUtility.SearchTestByExamCode(testList, searchExamCode));
						break;
					case 2:
						System.out.println("Nhập vào môn học cần tìm: ");
						String searchSubject = scanner.nextLine();
						if(dataUtility.SearchTestBySubject(testList, searchSubject).isEmpty())
							System.out.println("Không có đề thi của môn "+searchSubject);
						break;
					case 3:
						System.out.println("Nhập vào mã môn học của đề thi cần tìm: ");
						int searchSubjectCode = scanner.nextInt();
						if(dataUtility.SearchTestBySubjectCode(testList, searchSubjectCode).isEmpty())
							System.out.println("Không có đề thi có mã môn học "+ searchSubjectCode);
						else
							System.out.println(dataUtility.SearchTestBySubjectCode(testList, searchSubjectCode));
						break;
				}
				break;	
				
			case 18:
				testMngtsList = dataController.ReadTestMngtFromFile(TestsMngtFilename);
				int manageTestMngtChoice;
				
				do {
					System.out.println("1.Sắp xếp theo điểm");
					System.out.println("2.Đưa ra các bài thi có điểm cao nhất");
					System.out.println("3.Đưa ra các bài thi phạm quy");
					System.out.println("4.Thay đổi điểm các bài phạm quy về 0");
					System.out.println("5.Tính trung bình cộng điểm của tất cả bài thi trong kì thi ");
					System.out.println("Enter your choice: ");
					manageTestMngtChoice = scanner.nextInt();
					scanner.nextLine();
					if(manageTestMngtChoice<1 && manageTestMngtChoice>6)
						System.out.println("Không có lựa chọn "+manageTestMngtChoice);
				}while(manageTestMngtChoice<1 && manageTestMngtChoice>6);
				
				switch (manageTestMngtChoice) {
					case 1:
					dataUtility.SortTestMngtByMark(testMngtsList);
					dataController.UpdateFileDATA_TEST_MNGNT(testMngtsList, TestsMngtFilename);
					ShowListTestMngt(dataController, TestsMngtFilename);
					break;
					
					case 2:
					System.out.println(dataUtility.ShowTestHasHighestMark(testMngtsList));
					break;
					
					case 3:
					System.out.println(dataUtility.SearchTestViolatedRules(testMngtsList));
					break;
					
					case 4:
					dataUtility.ChangeTestViolatedRulesMarkToZero(testMngtsList);
					dataController.UpdateFileDATA_TEST_MNGNT(testMngtsList, TestsMngtFilename);
					ShowListTestMngt(dataController, TestsMngtFilename);
					break;
					
					case 5:
					System.out.println("Trung bình cộng của tất cả các bài thi : " + dataUtility.AverageMarkOfAllTest(testMngtsList));
					break;
					
				}
				break;
				
			}
            
            
		}while(choice!=0);
		
		
		scanner.close();
		}
	
	

	}
