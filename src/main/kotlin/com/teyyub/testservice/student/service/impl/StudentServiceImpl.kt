package com.teyyub.testservice.student.service.impl

import com.teyyub.testservice.student.mapper.StudentMapper
import com.teyyub.testservice.student.model.entity.Student
import com.teyyub.testservice.student.model.dto.StudentDto
import com.teyyub.testservice.student.repository.StudentRepository
import com.teyyub.testservice.student.service.api.StudentService
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentServiceImpl(
    val studentRepository: StudentRepository
) : StudentService {

    override fun findAll(name: String?, surname: String?, email: String?): List<Student> =
        studentRepository.findAll(Example.of(Student(name, surname, email)))

    override fun findById(id: Int) = studentRepository.findById(id)

    override fun save(studentDto: StudentDto) =
        studentRepository.save(StudentMapper.MAPPER.toEntity(studentDto))

    override fun update(id:Int, studentDto: StudentDto) =
        studentRepository.save(StudentMapper.MAPPER.toEntity(studentDto).apply { this.id = id })

    override fun delete(id: Int) = studentRepository.deleteById(id)
}
