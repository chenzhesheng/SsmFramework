package com.zson.ssmframework.dao;

import com.zson.ssmframework.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> findAll();

}
