package com.teyyub.testservice.student.model.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Student(
    @Id
    @GeneratedValue
    @Column(updatable = false)
    var id: Int?,

    @Column(nullable = false)
    var name: String?,

    @Column(nullable = false)
    var surname: String?,

    @Column(nullable = false)
    var email: String?
) {
    constructor():
            this(null, null, null, null)

    constructor(name: String?, surname: String?, email: String?):
            this(null, name, surname, email)
}
