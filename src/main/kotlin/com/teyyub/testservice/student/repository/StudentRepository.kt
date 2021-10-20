package com.teyyub.testservice.student.repository

import com.teyyub.testservice.student.model.entity.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository: JpaRepository<Student, Int>
