package com.venky.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "students")
public class Student {
	@Id
	private Integer id;
	
	@Column(name = "studentName", nullable = false)
	private String studentName;

	@Column(name = "studentCourse", nullable = false)
	private String studentCourse;
	
	@Column(name = "fee", nullable = false)
	private String fee;

	@Column(name = "m1", nullable = false)
	private Integer m1;

	@Column(name = "m2", nullable = false)
	private String m2;

	@Column(name = "m3", nullable = false)
	private String m3;


	public Student() {
		super();
	}


	public Student(Integer id, String studentName, String studentCourse, String fee, Integer m1, String m2, String m3) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.fee = fee;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentCourse() {
		return studentCourse;
	}


	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}


	public String getFee() {
		return fee;
	}


	public void setFee(String fee) {
		this.fee = fee;
	}


	public Integer getM1() {
		return m1;
	}


	public void setM1(Integer m1) {
		this.m1 = m1;
	}


	public String getM2() {
		return m2;
	}


	public void setM2(String m2) {
		this.m2 = m2;
	}


	public String getM3() {
		return m3;
	}


	public void setM3(String m3) {
		this.m3 = m3;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentCourse=" + studentCourse + ", fee="
				+ fee + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", getId()=" + getId() + ", getStudentName()="
				+ getStudentName() + ", getStudentCourse()=" + getStudentCourse() + ", getFee()=" + getFee()
				+ ", getM1()=" + getM1() + ", getM2()=" + getM2() + ", getM3()=" + getM3() + "]";
	}

	
	
}
