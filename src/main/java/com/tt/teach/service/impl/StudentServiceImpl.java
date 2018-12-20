package com.tt.teach.service.impl;

import com.tt.teach.dao.ResultDao;
import com.tt.teach.dao.StudentDao;
import com.tt.teach.pojo.Student;
import com.tt.teach.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *@作者：zhujungui
 *@时间：2018/12/19 14:09
 *@描述：业务逻辑层；不会做去找数据访问层
 */

@Service
public class StudentServiceImpl  implements StudentService{
    @Resource
    private StudentDao studentDao;


    public Student doLogin(Student student) {
        return studentDao.doLogin(student);
    }

    @Override
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }

    @Transactional
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Transactional
    public int deleteStudent(Integer stuNo) {
        return studentDao.deleteStudent(stuNo);
    }
}
