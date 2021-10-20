package com.teyyub.testservice.student.service.api

import com.teyyub.testservice.student.model.entity.Student
import com.teyyub.testservice.student.model.dto.StudentDto
import java.util.*

interface StudentService {
    fun findAll(name: String?, surname: String?, email: String?): List<Student>
    fun findById(id: Int): Optional<Student>
    fun save(studentDto: StudentDto): Student
    fun update(id:Int, studentDto: StudentDto): Student
    fun delete(id: Int)
}
