package com.tom

class PersonKotlin {
    fun greeting() {
        println("hello kotlin")
    }
}

//Top-level
fun main() {
    val p = PersonKotlin()
    p.greeting()
}