package com.taskManagementSystem.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication : CommandLineRunner {
    override fun run(vararg args: String?) {
        System.out.println("Code run when program start")
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
    System.out.println("Program started")
}
