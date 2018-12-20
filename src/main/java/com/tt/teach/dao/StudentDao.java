package com.tt.teach.dao;

import com.tt.teach.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Select("select student.*,grade.gradeName as gradeName from student,grade where student.gradeId=grade.gradeID")
    List<Student> getStudentList();
    @Update("update student set loginPwd=#{loginPwd},studentName=#{studentName},phone=#{phone} where studentNo=#{studentNo}")
    int updateStudent(Student student);

    @Delete("delete from student where studentNo = #{stuNo}")
    int deleteStudent(Integer stuNo);
}
