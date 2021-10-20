package com.teyyub.testservice.student.model.dto

import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class StudentDto(
    @field:NotBlank(message = "Name must not be blank")
    val name: String?,
    @field:NotBlank(message = "Surname must not be blank")
    val surname: String?,
    @field:Email(message = "Email must not be null")
    @field:NotNull(message = "Email must not be correct")
    val email: String?
)
