package com.jxw.swarm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SwarmApplication

fun main(args: Array<String>) {
    runApplication<SwarmApplication>(*args)
}
