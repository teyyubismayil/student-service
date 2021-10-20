package com.teyyub.testservice.student.controller

import com.teyyub.testservice.student.model.entity.Student
import com.teyyub.testservice.student.model.dto.StudentDto
import com.teyyub.testservice.student.service.api.StudentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import javax.validation.Valid

@RestController
@RequestMapping("/students")
class StudentController(
    val studentService: StudentService
) {

    @GetMapping
    fun findAll(
        @RequestParam(required = false) name: String?,
        @RequestParam(required = false) surname: String?,
        @RequestParam(required = false) email: String?
    ): List<Student> =
        studentService.findAll(name, surname, email)

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): Student =
        studentService.findById(id)
            .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND, "Student was not found") }

    @PostMapping
    fun save(@Valid @RequestBody studentDto: StudentDto) = studentService.save(studentDto)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @Valid @RequestBody studentDto: StudentDto) =
        studentService.update(id, studentDto)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) = studentService.delete(id)
}
