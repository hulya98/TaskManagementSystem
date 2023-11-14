package com.taskManagementSystem.demo.dto

import java.time.LocalDateTime

class UserDto(
    val id:String,
    val firstName:String,
    val lastName:String,
    private val createdDate: LocalDateTime,
    private val updatedDate: LocalDateTime
)