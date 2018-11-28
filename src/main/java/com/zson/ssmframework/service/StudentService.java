package com.zson.ssmframework.service;

import com.zson.ssmframework.bean.Student;
import com.zson.ssmframework.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper mapper;

    public List<Student> findStudentAll() {
        return mapper.findAll();
    }
}
