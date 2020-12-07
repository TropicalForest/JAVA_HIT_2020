package controller;
import java.util.ArrayList;
//import java.util.List;

import model.Student;
import model.Teacher;
import model.Test;
import model.Test_Management;


public class DataUtility {
	public ArrayList <Test_Management> UpdateTestMngt(ArrayList<Test_Management> list_t_mngt, Test_Management t_mngt) {
		boolean isUpdate = false;
		for(Test_Management t : list_t_mngt) {
			if(t.getTest_management_code() == t_mngt.getTest_management_code()) {
				isUpdate=true;
				break;
			}
		}
		if(!isUpdate)
			list_t_mngt.add(t_mngt);
		return list_t_mngt;
	}
	
	// Search student,teacher,test by ID
	public Student SearchStudentByID (ArrayList<Student> listStudent, int ID) {
		for(Student s : listStudent) {
			if(s.getstudentID() == ID) 
				return s;
		}
		
		return null;
	}
	public Teacher SearchTeacherByID (ArrayList<Teacher> listTeacher, int ID) {
		for(Teacher s : listTeacher) {
			if(s.getteacherID() == ID) 
				return s;
		}
		
		return null;
	}
	public ArrayList<Test> SearchTestByExamCode (ArrayList<Test> listTest, int examCode) {
		ArrayList<Test> foundList = new ArrayList<>();
		for(Test s : listTest) {
			if(s.getexamCode() == examCode) 
				foundList.add(s);
		}
		return foundList;
	}
	//Sort student,teacher,test by ID
	public ArrayList<Student> SortStudentByID (ArrayList<Student> listStudent) {
		int n = listStudent.size()-1;
		for(int i = 0; i < n; ++i) {
			for(int j = i+1; j < listStudent.size(); ++j) {
				if(listStudent.get(i).getstudentID() > listStudent.get(j).getstudentID()) {
					Student tmp = listStudent.get(i);
					listStudent.set(i, listStudent.get(j));
					listStudent.set(j, tmp);
				}
			}
		}
		return listStudent;
	}
	public ArrayList<Teacher> SortTeacherByID (ArrayList<Teacher> listTeacher) {
		int n = listTeacher.size()-1;
		for(int i = 0; i < n; ++i) {
			for(int j = i+1; j < listTeacher.size(); ++j) {
				if(listTeacher.get(i).getteacherID() > listTeacher.get(j).getteacherID()) {
					Teacher tmp = listTeacher.get(i);
					listTeacher.set(i, listTeacher.get(j));
					listTeacher.set(j, tmp);
				}
			}
		}
		return listTeacher;
	}
	public ArrayList<Test> SortTestByID (ArrayList<Test> listTest) {
		int n = listTest.size()-1;
		for(int i = 0; i < n; ++i) {
			for(int j = i+1; j < listTest.size(); ++j) {
				if(listTest.get(i).getexamCode() > listTest.get(j).getexamCode()) {
					Test tmp = listTest.get(i);
					listTest.set(i, listTest.get(j));
					listTest.set(j, tmp);
				}
			}
		}
		return listTest;
	}
	
	
	
	
	// Search student,teacher,test by Name
		public ArrayList<Student> SearchStudentByName (ArrayList<Student> listStudent, String name) {
			ArrayList<Student> foundList = new ArrayList<>();
			for(Student s : listStudent) {
				if(s.getName().contains(name)) 
					foundList.add(s);
			}
			
			return foundList;
		}
		public ArrayList<Teacher> SearchTeacherByName (ArrayList<Teacher> listTeacher, String name) {
			ArrayList<Teacher> foundList = new ArrayList<>();
			for(Teacher s : listTeacher) {
				if(s.getName().contains(name)) 
					foundList.add(s);
			}
			
			return foundList;
		}
		public ArrayList<Test> SearchTestBySubject (ArrayList<Test> listTest, String subject) {
			ArrayList<Test> foundList = new ArrayList<>();
			for(Test s : listTest) {
				if(s.getSubject().contains(subject)) 
					foundList.add(s);
			}
			return foundList;
		}
		
		
		
		
		// Others functions
		public ArrayList<Test> SearchTestBySubjectCode (ArrayList<Test> listTest, int subjectCode) {
			ArrayList<Test> foundList = new ArrayList<>();
			for(Test s : listTest) {
				if(s.getSubjectCode() == subjectCode) 
					foundList.add(s);
			}
			return foundList;
		}
		
		public ArrayList<Student> SearchStudentByClass (ArrayList<Student> listStudent, String classOfStudent) {
			ArrayList<Student> foundList = new ArrayList<>();
			for(Student s : listStudent) {
				if( s.getClassOfStudent().equalsIgnoreCase(classOfStudent)) 
					foundList.add(s);
			}
			return foundList;
		}
	
		public ArrayList<Student> SearchStudentByYearCourse (ArrayList<Student> listStudent, int YearCourse) {
			ArrayList<Student> foundList = new ArrayList<>();
			for(Student s : listStudent) {
				if(s.getYearCourse() == YearCourse) 
					foundList.add(s);
			}
			return foundList;
		}
			
		
		public ArrayList<Test_Management> SortTestMngtByMark (ArrayList<Test_Management> listTestMngt) {
			int n = listTestMngt.size()-1;
			for(int i = 0; i < n; ++i) {
				for(int j = i+1; j < listTestMngt.size(); ++j) {
					if(listTestMngt.get(i).getMark() < listTestMngt.get(j).getMark()) {
						Test_Management tmp = listTestMngt.get(i);
						listTestMngt.set(i, listTestMngt.get(j));
						listTestMngt.set(j, tmp);
					}
				}
			}
			return listTestMngt;
		}
	
		public double AverageMarkOfAllTest (ArrayList<Test_Management> listTestMngt) {
			double sum = 0;
			for(Test_Management tMngt : listTestMngt) 
				sum+= tMngt.getMark();
			return sum/listTestMngt.size();
		}
		
		public ArrayList<Test_Management> SearchTestViolatedRules (ArrayList<Test_Management> listTestMngt) {
			ArrayList<Test_Management> foundList = new ArrayList<>();
			for(Test_Management s : listTestMngt) {
				if(s.isViolatingRules() == true) 
					foundList.add(s);
			}
			return foundList;
		}
	
		public ArrayList<Test_Management> ChangeTestViolatedRulesMarkToZero (ArrayList<Test_Management> listTestMngt) {
			ArrayList<Test_Management> foundList = new ArrayList<>();
			for(Test_Management s : listTestMngt) {
				if(s.isViolatingRules() == true) 
					s.setMark(0);
			}
			return foundList;
		}
		public ArrayList<Test_Management> ShowTestHasHighestMark (ArrayList<Test_Management> listTestMngt) {
			ArrayList<Test_Management> foundList = new ArrayList<>();
			int max = listTestMngt.get(0).getMark();
			for(Test_Management tMngt : listTestMngt)
				if(tMngt.getMark() > max)
					max = tMngt.getMark();
			
			for(Test_Management tMngt : listTestMngt)
				if(tMngt.getMark() == max)
					foundList.add(tMngt);
			return foundList;
		}
		
		
		
//		public ArrayList<Test_Management> SortTestManagementByExamCode (ArrayList<Test_Management> listTestManagement) {
//			int n = listTestManagement.size()-1;
//			for(int i = 0; i < n; ++i) {
//				for(int j = i+1; j < listTestManagement.size(); ++j) {
//					if(listTestManagement.get(i).getTest().getexamCode() > listTestManagement.get(j).getTest().getexamCode()) {
//						Test_Management tmp = listTestManagement.get(i);
//						listTestManagement.set(i, listTestManagement.get(j));
//						listTestManagement.set(j, tmp);
//					}
//				}
//			}
//			return listTestManagement;
//		}
//			
//		public ArrayList<Test_Management> SortTestManagementByStudentID (ArrayList<Test_Management> listTestManagement) {
//			int n = listTestManagement.size()-1;
//			for(int i = 0; i < n; ++i) {
//				for(int j = i+1; j < listTestManagement.size(); ++j) {
//					if(listTestManagement.get(i).getStudent().getstudentID() > listTestManagement.get(j).getStudent().getstudentID()) {
//						Test_Management tmp = listTestManagement.get(i);
//						listTestManagement.set(i, listTestManagement.get(j));
//						listTestManagement.set(j, tmp);
//					}
//				}
//			}
//			return listTestManagement;
//		}
//		public ArrayList<Test_Management> SortTestManagementByTeacherID (ArrayList<Test_Management> listTestManagement) {
//			int n = listTestManagement.size()-1;
//			for(int i = 0; i < n; ++i) {
//				for(int j = i+1; j < listTestManagement.size(); ++j) {
//					if(listTestManagement.get(i).getExaminer().getteacherID() > listTestManagement.get(j).getExaminer().getteacherID()) {
//						Test_Management tmp = listTestManagement.get(i);
//						listTestManagement.set(i, listTestManagement.get(j));
//						listTestManagement.set(j, tmp);
//					}
//				}
//			}
//			return listTestManagement;
//		}

		
		
		
		
}
