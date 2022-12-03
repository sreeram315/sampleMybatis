package com.mybatisSample.student.mapper;

import com.mybatisSample.student.models.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM student WHERE id = #{id, typeHandler = com.typehandler.student.typehandler.TestTypeHandler}")
    Student getStudent(@Param("id") int id);

}
