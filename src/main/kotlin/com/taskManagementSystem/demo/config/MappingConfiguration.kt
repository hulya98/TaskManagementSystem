package com.taskManagementSystem.demo.config

import com.taskManagementSystem.demo.mapper.UserMapper
import com.taskManagementSystem.demo.mapper.UserMapperImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MappingConfiguration {
    @Bean
    fun userMapper(): UserMapper {
        return UserMapperImpl();
    }
}