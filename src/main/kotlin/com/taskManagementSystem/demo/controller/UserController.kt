package com.taskManagementSystem.demo.controller

import com.taskManagementSystem.demo.dto.UserDto
import com.taskManagementSystem.demo.service.UserService
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors

@RestController
@RequestMapping("v1/users")
class UserController(private val userService: UserService) {
    @GetMapping("/get-data")
    fun getUsers(): ResponseEntity<List<UserDto>> {
        val users = userService.getUsers().stream().filter { x -> !x.isDeleted }.collect(Collectors.toList())
        return ResponseEntity.ok(users);
    }

    @PostMapping("v1/add-user")
    fun addUser(@RequestBody userDto: UserDto): ResponseEntity<String> {
        userService.saveUser(userDto)
        return ResponseEntity.status(HttpStatus.CREATED).body("User added")
    }

    @PostMapping("v1/delete-user")
    fun deleteUser(@RequestParam id: String): ResponseEntity<String> {
        userService.deleteUser(id)
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("User deleted")
    }
}
