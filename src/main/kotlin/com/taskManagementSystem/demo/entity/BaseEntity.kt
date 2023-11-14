package com.taskManagementSystem.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

@MappedSuperclass
open class BaseEntity(
    val createdDate: LocalDateTime,
    val updatedDate: LocalDateTime,
)