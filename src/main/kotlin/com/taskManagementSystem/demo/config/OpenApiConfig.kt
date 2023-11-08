package com.taskManagementSystem.demo.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.servers.Server
import jakarta.servlet.ServletContext
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class OpenApiConfig {

    @Bean
    fun customOpenAPI(servletContext: ServletContext): OpenAPI {
        val server: Server = Server().url(servletContext.contextPath)
        return OpenAPI()
            .servers(listOf(server))
            .info(
                Info()
                    .title("Task Management")
                    .version("1.0")
            )
    }
}
