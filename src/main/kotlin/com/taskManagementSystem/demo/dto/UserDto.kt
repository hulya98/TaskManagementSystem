package com.taskManagementSystem.demo.dto

import java.time.LocalDateTime

class UserDto(
    val id: String,
    val firstName: String,
    val lastName: String,
    val isDeleted: Boolean,
    private val createdDate: LocalDateTime,
    private val updatedDate: LocalDateTime
)