package com.caprusIt.Interface;

	import java.util.List;

import org.springframework.data.domain.Page;

import com.caprusIt.entity.Paganition;
import com.caprusIt.entity.Student;


	

	public interface StudentInterface {
		//To save new student
		public Student saveStudent(Student student);
		
		//To update Student
		
		public Student updateStudent(Student student);
		
		// To fetch all students from database
		
		public List<Student> findAllStudents();
		
		// To delete student
		public void deleteStudent(int id);

		 public Page<Student> getStudents(Paganition paganition);
		
	}


