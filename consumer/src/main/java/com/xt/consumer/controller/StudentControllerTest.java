package com.xt.consumer.controller;

import com.xt.api.entity.Studtent;
import com.xt.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author xuetao
 * @Description: TODO
 * @Date 2019-02-14
 * @Version 1.0
 */
@Controller
@RequestMapping("index")
public class StudentControllerTest {

    @Autowired
    private StudentService studentService;

    @RequestMapping("find")
    @ResponseBody
    public Studtent getStudentByID(HttpServletRequest request) throws Exception {
        Studtent studtent = studentService.findStudent();
        return studtent;
    }


    @RequestMapping("findOne")
    @ResponseBody
    public Studtent getStudent(HttpServletRequest request) throws Exception {
        Studtent studtent = studentService.findStudent();
        return studtent;
    }
}
