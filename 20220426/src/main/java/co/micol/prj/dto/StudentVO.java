package co.micol.prj.dto;

import java.sql.Date;

public class StudentVO {
	private String studentId; //�й�
	private String name; //�̸�
	private int age; //����
	private String gender; //����
	private Date birthDay;  //�������
	
	public StudentVO()	{	
	}
	
	public StudentVO(String name) { // ������ �����ε�
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public String toString() { //toString()�޼ҵ带 �������̵���
		System.out.print(studentId + " : ");
		System.out.print(name + " : ");
		System.out.print(age + " : ");
		System.out.print(birthDay + " : ");
		System.out.println(gender);
		return null;
	}
}
