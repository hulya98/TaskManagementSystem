package com.taskManagementSystem.demo.repository

import com.taskManagementSystem.demo.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service
interface UserRepository : JpaRepository<User, String> {

}