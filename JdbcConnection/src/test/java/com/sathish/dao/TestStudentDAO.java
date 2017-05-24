package com.sathish.dao;

import com.sathish.model.Student;

public class TestStudentDAO {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("name");
		student.setEmail("ms.sathish.26@gmail.com");
		student.setPassword("sathish");
		StudentDAO dao=new StudentDAO();
		dao.save(student);
	}

}
