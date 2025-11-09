package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.IStudentRepository;

@Service
public class StudentMgmtServiceImpl implements IStudentMgmtService {

	@Autowired
	private IStudentRepository stdRepo;
	@Override
	public Student saveStudent(Student student) {
		return stdRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return stdRepo.save(student);
	}

	@Override
	public void deleteStudent(Integer id) {
		stdRepo.deleteById(id);

	}

	@Override
	public Student getStudent(Integer id) {
		return stdRepo.findById(id).orElse(null);
	}

	@Override
	public List<Student> getAllStudents() {
		return stdRepo.findAll();
	}

}
