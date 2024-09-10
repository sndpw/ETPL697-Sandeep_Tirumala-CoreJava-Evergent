package com.evergent.coreJAVA.studentapplication;

import java.io.Serializable;

public class StudentBean implements Serializable {
	private int sid;
	private String sname;
	private String course;
	private float test1;
	private float test2;
	private String grade;

	public int getStudentId() {
		return sid;
	}

	public void setStudentId(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return sname;
	}

	public void setName(String sname) {
		this.sname = sname;
	}

	public float getTest1() {
		return test1;
	}

	public void setTest1(float test1) {
		this.test1 = test1;
	}

	public float getTest2() {
		return test2;
	}

	public void setTest2(float test2) {
		this.test2 = test2;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
