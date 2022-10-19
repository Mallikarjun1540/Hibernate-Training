package com.hibernate7542.entity;

import javax.persistence.*;

@Entity
@Table(name = "studententity")
public class StudentEntity {
	@Id
	private int studentId;
	
	@Column(nullable =false)
	private String studentName;
	
	@Column(nullable =false)
	private String studentEmail;
	
	@Column(nullable =false)
	private String studentContact;
	
	@Column(nullable =false)
	private String studentAddress;

	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail="
				+ studentEmail + ", studentContact=" + studentContact + ", studentAddress=" + studentAddress + "]";
	}
	

}
