package com.ukjeong.sample.spring.module.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleSpringModuleKotlinApplication

fun main(args: Array<String>) {
    runApplication<SampleSpringModuleKotlinApplication>(*args)
}
