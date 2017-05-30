package com.mithun.model;

import com.mithun.myenum.Grade;

public class Student {
	private String studentName;
	private String stId;
	private String department;
	private int hci;
	private int dbms;
	private int ai;
	private Grade gHci;
	private Grade gDbms;
	private Grade gAi;
	
	public Student(String studentName, String stId, String department,
			int hci, int dbms, int ai) {
		super();
		this.studentName = studentName;
		this.stId = stId;
		this.department = department;
		this.hci = hci;
		this.dbms = dbms;
		this.ai = ai;
		setGrades(hci, dbms, ai);
	}

	private void setGrades(int hci2, int dbms2, int ai2) {
		gHci = getGradeFromMark(hci2);
		gDbms = getGradeFromMark(dbms2);
		gAi = getGradeFromMark(ai2);
	}

	private Grade getGradeFromMark(int mark) {
		Grade g = Grade.F;
		if( mark >= 90 && mark <= 100)
			g = Grade.A;
		else if(mark >= 80 && mark < 90)
			g = Grade.B;
		else if(mark >= 70 && mark < 80)
			g = Grade.C;
		else if(mark >= 60 && mark < 70)
			g = Grade.D;
		return g;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStId() {
		return stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getHci() {
		return hci;
	}

	public void setHci(int hci) {
		this.hci = hci;
	}

	public int getDbms() {
		return dbms;
	}

	public void setDbms(int dbms) {
		this.dbms = dbms;
	}

	public int getAi() {
		return ai;
	}

	public void setAi(int ai) {
		this.ai = ai;
	}

	public double getAvgGP() {
		return (gHci.getGrade() + gDbms.getGrade() + gAi.getGrade()) / 3;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", stId=" + stId + ", department=" + department + ", hci=" + hci
				+ ", dbms=" + dbms + ", ai=" + ai + "]";
	}
}
