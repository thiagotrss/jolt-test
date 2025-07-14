package br.com.rss.jolt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JoltTransformerApplication

fun main(args: Array<String>) {
    runApplication<JoltTransformerApplication>(*args)
}
