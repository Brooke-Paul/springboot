package com.xt.provider.service.impl;

import com.xt.api.entity.Studtent;
import com.xt.api.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author xuetao
 * @Description: TODO
 * @Date 2019-02-14
 * @Version 1.0
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Override
    public Studtent findStudent() throws Exception {
        return new Studtent(UUID.randomUUID().toString(), "zhangshan", "2012-07-02");
    }
}
