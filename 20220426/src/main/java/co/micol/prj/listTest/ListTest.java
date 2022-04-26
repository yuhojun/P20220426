package co.micol.prj.listTest;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.micol.prj.dto.StudentVO;

public class ListTest {
	public void listTest() {
		List<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�ڱ���");
		list.add("�̽¸�");

		for (String str : list) {
			System.out.println(str);
		}
	}

	public void studentList() {
		List<StudentVO> students = new ArrayList<StudentVO>();//���������� �˻��Ҷ� ����Ʈ�� ���Ϻ���
		StudentVO student = new StudentVO(); // ��ü�� ��������(����)
		student.setStudentId("202204001");
		student.setName("ȫ�浿");
		student.setAge(20);
		student.setBirthDay(Date.valueOf("2002-03-01"));
		student.setGender("F");
		students.add(student);

		student = new StudentVO(); // �ʱ�ȭ�ؼ� �ؿ� ���δ�´�
		student.setStudentId("202204002");
		student.setName("�ڱ���");
		student.setAge(20);
		student.setBirthDay(Date.valueOf("2002-04-01"));
		student.setGender("W");
		students.add(student);

		for (StudentVO vo : students) {
			vo.toString();
			vo.getStudentId(); 
		}
	}

}
