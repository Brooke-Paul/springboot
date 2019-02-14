package com.xt.consumer;

import com.xt.api.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:/spring/spring*"})
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ConsumerApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);

        StudentService studentService = (StudentService) applicationContext.getBean("studentService");

        try {
            System.out.println(studentService.findStudent());
        } catch (Exception e) {

        }
    }

}

