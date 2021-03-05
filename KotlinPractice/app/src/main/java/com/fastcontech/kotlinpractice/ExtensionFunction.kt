package com.fastcontech.kotlinpractice

class ExtensionFunction {
    fun String.hasPlusSign(): Boolean {
        val found = this.find { it == '+' }
        println(found)
        return found != null
    }

    fun Int.isNegative(): Boolean {
        val isNegativeNum = this.minus(-1)
        return isNegativeNum < 0
    }

    fun useExtensionFunction(): Boolean {
        return "This is a test for +".hasPlusSign()
    }

    fun useExtensionFunction2(num: Int): Boolean {
        return num.isNegative()
    }
}

class UseDefinedClass()

fun UseDefinedClass.isBlue(color: String): Boolean {

    return color == "blue"
}

fun useExtensionFunction3(): Boolean {
  return  UseDefinedClass().isBlue("blue")
}

fun main() {
    val ex = ExtensionFunction()
    println(ex.useExtensionFunction())
    println(ex.useExtensionFunction2(-3))

    println(useExtensionFunction3())
}