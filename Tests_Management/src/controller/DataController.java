package controller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import model.Student;
import model.Teacher;
import model.Test;
import model.Test_Management;

public class DataController {
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private PrintWriter printWriter;
	private Scanner scanner;
	
	

	
	
	public void OpenFileToWrite(String filename) {
		try {
			fileWriter = new FileWriter(filename, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			printWriter = new PrintWriter(bufferedWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void CloseFileAfterWrite() {
		try {
			printWriter.close();
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void OpenFileToRead(String filename) {
		try {
			File file = new File(filename);
			if(!file.exists()) {
				file.createNewFile();
			}
			scanner = new Scanner(Paths.get(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void CloseFileAfterRead() {
		try {
			scanner.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void WriteStudentToFile(String filename, Student student) {
		OpenFileToWrite(filename);
		printWriter.println(student.getstudentID() + "-" + student.getName() + "-" + 
							student.getClassOfStudent() + "-" + student.getYearCourse());
		CloseFileAfterWrite();
	}
	public void WriteTeacherToFile(String filename, Teacher teacher) {
		OpenFileToWrite(filename);
		printWriter.println(teacher.getName() + "-" + teacher.getteacherID());
		CloseFileAfterWrite();
	}
	public void WriteTestToFile(String filename, Test test) {
		OpenFileToWrite(filename);
		printWriter.println(test.getexamCode() + "-" + test.getAmountOfQuestion() + "-" + 
							test.getSubject() + "-" + test.getSubjectCode());
		CloseFileAfterWrite();
	}
	public void WriteTestMngtToFile(String filename, Test_Management tMngt) {
		OpenFileToWrite(filename);
		printWriter.println(tMngt.getStudent().getName() + "-" + tMngt.getStudent().getstudentID() + "-" + tMngt.getStudent().getClassOfStudent() + "-" + tMngt.getStudent().getYearCourse() + "-" +
							"-" + tMngt.getExaminer().toString() + "-" + 
							tMngt.getTest().getSubject() + "-" + tMngt.getTest().getSubjectCode() + "-" + tMngt.getTest().getexamCode() + "-" + tMngt.getTest().getAmountOfQuestion() + "-" + tMngt.getMark());
		CloseFileAfterWrite();
	}
	
    private Student createStudentFromData(String data) {
        String[] datas = data.split("-");
        Student student = new Student(Integer.parseInt(datas[0]), datas[1], datas[2], Integer.parseInt(datas[3]));
        return student;
    }  

	public ArrayList<Student> ReadStudentFromFile(String filename) {
		OpenFileToRead(filename);
		ArrayList<Student> listStudent = new ArrayList<>();
		while(scanner.hasNext()) {
			String data = scanner.nextLine();
			Student student = createStudentFromData(data);
			listStudent.add(student);
		}
		CloseFileAfterRead();
		return listStudent;
	}
	
    private Teacher createTeacherFromData(String data) {
        String[] datas = data.split("-");
        Teacher teacher = new Teacher(datas[0], Integer.parseInt(datas[1]) );
        return teacher;
    }   
	public ArrayList<Teacher> ReadTeacherFromFile(String filename) {
		OpenFileToRead(filename);
		ArrayList<Teacher> listTeacher = new ArrayList<>();
		while(scanner.hasNext()) {
			String data = scanner.nextLine();
			Teacher teacher = createTeacherFromData(data);
			listTeacher.add(teacher);
		}
		CloseFileAfterRead();
		return listTeacher;
	} 
	
    private Test createTestFromData(String data) {
        String[] datas = data.split("-");
        Test test = new Test(Integer.parseInt(datas[0]), Integer.parseInt(datas[1]), datas[2],Integer.parseInt(datas[3]));
        return test;
    }   
	public ArrayList<Test> ReadTestFromFile(String filename) {
		OpenFileToRead(filename);
		ArrayList<Test> listTest = new ArrayList<>();
		while(scanner.hasNext()) {
			String data = scanner.nextLine();
			Test test = createTestFromData(data);
			listTest.add(test);
		}
		CloseFileAfterRead();
		return listTest;
	} 
	

	private static Student getStudent(ArrayList<Student> listStudent, int studentID) {
		for(Student student : listStudent) {
			if(student.getstudentID() == studentID)
				return student;
		}
		return null;
	}	
	
	private static Teacher getTeacher(ArrayList<Teacher> listTeacher, int teacherID) {
		for(Teacher teacher : listTeacher) {
			if(teacher.getteacherID() == teacherID)
				return teacher;
		}
		return null;
	}
	private static Test getTest(ArrayList<Test> listTest, int examCode) {
		for(Test test : listTest) {
			if(test.getexamCode() == examCode)
				return test;
		}
		return null;
	}

	private Test_Management createTestMngtFromData(String data, ArrayList<Student> listStudent, ArrayList<Teacher> listExaminer, ArrayList<Test> listTest ) {
      String[] datas = data.split("-");
      Student student = getStudent(listStudent, Integer.parseInt(datas[0]));
      Teacher teacher = getTeacher(listExaminer, Integer.parseInt(datas[4]));
      Test test = getTest(listTest, Integer.parseInt(datas[6]));  
      int test_management_code = Integer.parseInt(datas[9]);
      int mark = Integer.parseInt(datas[10]);
      String violatingRules = datas[11];
      Test_Management test_mngt = new Test_Management(student,teacher,test,test_management_code,mark,violatingRules);
      return test_mngt;
  }   
  

	public ArrayList<Test_Management> ReadTestMngtFromFile(String filename) {
		ArrayList<Student> listStudent = ReadStudentFromFile("STUDENT.DAT");
		ArrayList<Teacher> listExaminer = ReadTeacherFromFile("EXAMINER.DAT");
		ArrayList<Test> listTest = ReadTestFromFile("TEST.DAT");
		OpenFileToRead(filename);
		
		ArrayList<Test_Management> listTestMngt = new ArrayList<>();
		while(scanner.hasNext()) {
			String data = scanner.nextLine();
			Test_Management test_management = createTestMngtFromData(data,listStudent,listExaminer,listTest);
			listTestMngt.add(test_management);
		}
		CloseFileAfterRead();
		return listTestMngt;
	} 	
	
	public void UpdateFileDATA_STUDENT(ArrayList<Student> listStudent, String filename) {
		File file = new File(filename);
		if(file.exists()) {
			file.delete();
		}
		OpenFileToWrite(filename);
		for(Student student : listStudent) {
			printWriter.println(student.getstudentID() + "-" + student.getName() + "-" + student.getClassOfStudent() + "-"
					+ student.getYearCourse());
		}
		CloseFileAfterWrite();
	}
	
	
	public void UpdateFileDATA_EXAMINER(ArrayList<Teacher> listExaminer, String filename) {
		File file = new File(filename);
		if(file.exists()) {
			file.delete();
		}
		OpenFileToWrite(filename);
		for(Teacher examiner : listExaminer) {
			printWriter.println(examiner.getteacherID() + "-" + examiner.getName() );

		}
		CloseFileAfterWrite();
	}
	public void UpdateFileDATA_TEST(ArrayList<Test> listTest, String filename) {
		File file = new File(filename);
		if(file.exists()) {
			file.delete();
		}
		OpenFileToWrite(filename);
		for(Test test : listTest) {
			printWriter.println(test.getexamCode() + "-" + test.getAmountOfQuestion() +"-"+ test.getSubject()+"-"+test.getSubjectCode() );

		}
		CloseFileAfterWrite();
	}
	public void UpdateFileDATA_TEST_MNGNT(ArrayList<Test_Management> listTest_Mngt, String filename) {
		File file = new File(filename);
		if(file.exists()) {
			file.delete();
		}
		OpenFileToWrite(filename);
		for(Test_Management t_mngt : listTest_Mngt) {
			printWriter.println(t_mngt.getStudent().getstudentID()+"-"+t_mngt.getStudent().getName()+"-"+t_mngt.getStudent().getClassOfStudent()+"-"+t_mngt.getStudent().getYearCourse()
					+"-"+t_mngt.getExaminer().getteacherID()+"-"+t_mngt.getExaminer().getName() 
					+"-"+t_mngt.getTest().getexamCode()+"-"+t_mngt.getTest().getAmountOfQuestion()+"-"+t_mngt.getTest().getSubject()+"-"+t_mngt.getTest().getSubjectCode()+"-"+t_mngt.getMark() +"-"+t_mngt.getViolatingRules()      
					);
		}
		CloseFileAfterWrite();
	}
	
	
	
}
