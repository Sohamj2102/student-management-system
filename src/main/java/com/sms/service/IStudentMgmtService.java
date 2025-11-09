package com.sms.service;

import java.util.List;

import com.sms.entity.Student;

public interface IStudentMgmtService {

	Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Integer id);
    Student getStudent(Integer id);
    List<Student> getAllStudents();
}
