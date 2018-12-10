package com.zson.ssmframework.action;

import com.github.pagehelper.PageHelper;
import com.zson.ssmframework.bean.Student;
import com.zson.ssmframework.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@CacheConfig(cacheNames = "student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/listStudent")
        @CachePut( key = "listStudent",unless="#result==null")
        public String listStudent(Model model){
            PageHelper.startPage(1,3);
            List<Student> students = studentService.findStudentAll();
            model.addAttribute("students",students);
            return "listStudent";
    }

}
