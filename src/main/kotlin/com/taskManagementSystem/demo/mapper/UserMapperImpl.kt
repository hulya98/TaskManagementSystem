package com.taskManagementSystem.demo.mapper

import com.taskManagementSystem.demo.dto.UserDto
import com.taskManagementSystem.demo.entity.User
import java.time.LocalDateTime

class UserMapperImpl : UserMapper {
    override fun userToUserDto(user: User): UserDto {
        var id: String? = null
        var firstName: String? = null
        var lastName: String? = null
        var createdDate: LocalDateTime? = null
        var updatedDate: LocalDateTime? = null
        var isDeleted: Boolean = false

        id = user.id;
        firstName = user.firstName
        lastName = user.lastName
        createdDate = user.createdDate
        updatedDate = user.updatedDate
        isDeleted = user.isDeleted

        var userDto = UserDto(id, firstName, lastName, isDeleted, createdDate, updatedDate)
        return userDto
    }

    override fun userDtoToUser(userDto: UserDto): User {
        var id: String? = null
        var firstName: String? = null
        var lastName: String? = null
        var createdDate: LocalDateTime? = null
        var updatedDate: LocalDateTime? = null
        var isDeleted: Boolean = false

        id = userDto.id;
        firstName = userDto.firstName
        lastName = userDto.lastName
        isDeleted = userDto.isDeleted
        createdDate = LocalDateTime.now()
        updatedDate = LocalDateTime.now()
        var user = User(id, firstName, lastName, isDeleted)
        user.createdDate = createdDate
        user.updatedDate = updatedDate


        return user
    }
}