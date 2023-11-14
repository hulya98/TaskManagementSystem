package com.taskManagementSystem.demo.dto

import java.time.LocalDateTime

class TaskDto(
    val id: String,
    val header: String,
    val description: String,
    private val createdDate: LocalDateTime,
    private val updatedDate: LocalDateTime
)