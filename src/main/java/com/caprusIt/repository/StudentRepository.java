package com.caprusIt.repository;

import java.util.List;

import org.hibernate.dialect.Database;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.caprusIt.Interface.StudentInterface;
import com.caprusIt.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query(value="insert into student values(?,?,?)",nativeQuery=true)
	public Student saveStudent(Student student);

	@Query(value="update student set name=?,email=?,address=? where id=?",nativeQuery=true)
	public Student updateStudent(Student student);

	@Query(value="delete from student where id=?",nativeQuery=true)
	public void deleteStudent(Long id);

	@Query(value="select * from student ",nativeQuery=true)
	public List<Student> findAllStudents();
	
}
