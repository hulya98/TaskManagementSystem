package com.taskManagementSystem.demo.mapper

import com.taskManagementSystem.demo.dto.TaskDto
import com.taskManagementSystem.demo.entity.Task
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface TaskMapper {
    fun taskToTaskDto(task: Task): TaskDto

    @Mapping(target = "id", ignore = true)
    fun taskDtoToTask(taskDto: TaskDto): Task

}