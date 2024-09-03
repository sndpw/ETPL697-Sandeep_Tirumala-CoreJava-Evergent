package com.evergent.coreJAVA.studentapplication;

public class StudentService {
	public static int addStudentService(int sid, String sname, String course, float test1, float test2) {
		String grade = "";
		float avg = (test1 + test2) / 2;
		
		if (avg >= 91 && avg <= 100) {
			grade = "A";
		} else if (avg >= 81 && avg <= 90) {
			grade = "B";

		} else if (avg >= 60 && avg <= 80) {
			grade = "c";
		} else {
			grade = "F";
		}

		StudentDAO studentDAO = new StudentDAO();
		StudentBean studentBean = new StudentBean();
		studentBean.setStudentId(sid);
		studentBean.setName(sname);
		studentBean.setCourse(course);
		studentBean.setTest1(test1);
		studentBean.setTest2(test2);
		studentBean.setGrade(grade);

		int updateResult = StudentDAO.addStudent(studentBean);

		return 1;
	}
}
