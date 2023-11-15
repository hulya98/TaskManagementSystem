package com.taskManagementSystem.demo.mapper

import com.taskManagementSystem.demo.dto.UserDto
import com.taskManagementSystem.demo.entity.User
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface UserMapper {
    fun userToUserDto(user: User): UserDto

    fun userDtoToUser(userDto: UserDto): User
}