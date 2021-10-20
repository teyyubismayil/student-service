package com.teyyub.testservice.student.mapper

import com.teyyub.testservice.student.model.dto.StudentDto
import com.teyyub.testservice.student.model.entity.Student
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface StudentMapper {

    fun toEntity(studentDto: StudentDto): Student

    companion object {
        val MAPPER: StudentMapper = Mappers.getMapper(StudentMapper::class.java)
    }
}
