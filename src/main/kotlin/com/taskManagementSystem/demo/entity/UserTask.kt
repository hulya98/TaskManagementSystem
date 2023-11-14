package com.taskManagementSystem.demo.entity

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
class UserTask(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String,
    @ManyToOne
    val user: User,
    @ManyToOne
    val task: Task
)

