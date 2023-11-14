package com.taskManagementSystem.demo.mapper

import com.taskManagementSystem.demo.dto.TaskDto
import com.taskManagementSystem.demo.dto.UserDto
import com.taskManagementSystem.demo.entity.Task
import com.taskManagementSystem.demo.entity.User
import java.time.LocalDateTime

class TaskMapperImpl : TaskMapper {
    override fun taskToTaskDto(task: Task): TaskDto {
        var id: String? = null
        var header: String? = null
        var description: String? = null
        var createdDate: LocalDateTime? = null
        var updatedDate: LocalDateTime? = null

        id = task.id;
        header = task.header;
        description = task.description;
        createdDate = task.createdDate;
        updatedDate = task.updatedDate;

        var taskDto = TaskDto(id, header, description, createdDate, updatedDate);
        return taskDto;
    }

    override fun taskDtoToTask(taskDto: TaskDto): Task {
        var id: String? = null
        var header: String? = null
        var description: String? = null

        id = taskDto.id;
        header = taskDto.header;
        description = taskDto.description;

        var task = Task(id, header, description);

        return task;
    }
}