package com.taskManagementSystem.demo.mapper

import com.taskManagementSystem.demo.dto.UserDto
import com.taskManagementSystem.demo.entity.User

class UserMapperImpl : UserMapper {
    override fun userToUserDto(user: User): UserDto {
        var id: String? = null
        var firstName: String? = null
        var lastName: String? = null

        id = user.id;
        firstName = user.firstName;
        lastName = user.lastName;


        var userDto = UserDto(id, firstName, lastName);
        return userDto;
    }

    override fun userDtoToUser(userDto: UserDto): User {
        var id: String? = null
        var firstName: String? = null
        var lastName: String? = null

        id = userDto.id;
        firstName = userDto.firstName;
        lastName = userDto.lastName;

        var user = User(id, firstName, lastName);

        return user;
    }
}