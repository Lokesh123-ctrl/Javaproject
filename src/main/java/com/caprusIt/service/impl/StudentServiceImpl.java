package com.caprusIt.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.caprusIt.Interface.StudentInterface;
import com.caprusIt.entity.Paganition;
import com.caprusIt.entity.Student;
import com.caprusIt.repository.AddressRepository;
import com.caprusIt.repository.StudentRepository;

import caprusit.security.EncryptionDecryptionAES;


@Service
public class StudentServiceImpl implements StudentInterface{
 
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private AddressRepository addRepo;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student); // Same save method
	}                          

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}
	
	 @Override
	 public Page<Student> getStudents(Paganition paganition){
		 Sort sort =Sort.by(paganition.getSortDirection(),paganition.getSortBY());
		 Pageable pageable=PageRequest.of(paganition.getPageNumber(),
				 paganition.getPageSize(),sort); 
		return studentRepo.findAll(pageable);
		 
	 }
	@Override
	public List<Student> findAllStudents() {
		// It returns a list so casting is needed
		List<Student> studentList =  studentRepo.findAll();
		studentList.forEach(student -> {
			try {
				student.setPassword(EncryptionDecryptionAES.decrypt(student.getPassword()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		});
		return studentList;
	}


	@Override
	public void deleteStudent(int id) {
		// To delete student
		studentRepo.deleteById(id);
		
	}

	public int callProcedure(int studentId, int addressId) {
		return addRepo.insertAndReturnTotal(studentId, addressId);
		
	}
}


