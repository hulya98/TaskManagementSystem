package com.taskManagementSystem.demo.entity

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
class UserTask(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String,
    @OneToMany
    @JoinColumn(name = "users_id")
    val users: List<User>,
//    @ManyToOne
//    @JoinColumn(name = "tasks_id")
//    val tasks: Task
)