package com.mithun.myenum;

public enum Grade {
	A(4.0), B(3.5), C(3.0), D(2.0), F(0.0);
	
	private final double GRADE_POINT;
	private Grade(double grade) {
		GRADE_POINT = grade;
	}
	
	public double getGrade() {
		return GRADE_POINT;
	}
}
