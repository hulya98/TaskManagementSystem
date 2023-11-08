package com.taskManagementSystem.demo.service

import com.taskManagementSystem.demo.dto.UserDto
import com.taskManagementSystem.demo.mapper.UserMapper
import com.taskManagementSystem.demo.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val userMapper: UserMapper
) {
    fun addUser(userDto: UserDto) {
        val user = userMapper.userDtoToUser(userDto)
        userRepository.save(user);
    }

    fun getUsers(): List<UserDto> {
        val users = userRepository.findAll()
        return users.map { userMapper.userToUserDto(it) }
    }
}