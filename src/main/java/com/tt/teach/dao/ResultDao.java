package com.tt.teach.dao;

import com.tt.teach.pojo.Result;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *@作者：zhujungui
 *@时间：2018/12/20 11:25
 *@描述：接口
 */
@Mapper
@Repository
public interface ResultDao {
    @Select("select result.*,student.studentName AS studentName,subjectName AS subjectName from result,student,subject WHERE result.studentNo=student.studentNo and result.subjectNo =subject.subjectNo ORDER BY result.examDate DESC ")
    List<Result> getResultList();
    @Delete("delete  from result where resultNo=#{resultNo}")
    int deleteResult(Integer resultNo);
}
