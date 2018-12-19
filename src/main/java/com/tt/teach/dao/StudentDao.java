package com.tt.teach.dao;

import com.tt.teach.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @作者：zhujungui
 * @时间：2018/12/19 14:11
 * @描述：数据访问层接口
 */
@Mapper
@Repository
public interface StudentDao {
    @Select("select * from  student where studentNo=#{studentNo} and loginPwd=#{loginPwd}")
    Student doLogin(Student student);
}
