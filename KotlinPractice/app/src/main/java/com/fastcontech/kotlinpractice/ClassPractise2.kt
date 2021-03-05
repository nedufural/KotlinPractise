package com.fastcontech.kotlinpractice

// this replaces the previous class declaration
//open classes can be subclassed
open class ClassPractise2(var length: Int = 100, var height: Int = 80, var width: Int = 60) {
    open val val1 = 12
    open fun printValues() {
        println("Values from $length $height $width ")
    }

    init {
        println("runs before secondary constructor")
    }

    constructor(length: Int) : this() {
        println("length $length ")
    }

    constructor(length: Int, breath: Int) : this() {
        println("length $length breath $breath")
    }
}

class Inheritance : ClassPractise2(){
    override val val1 = 13
    override fun printValues() {
        println("Values inherit from $length $height $width ")
    }
}

fun main(args: Array<String>) {
    val classPractise1 = ClassPractise2()
    ClassPractise2(10)
    ClassPractise2(10, 20)

    classPractise1.printValues()
    val inherit = Inheritance()
    inherit.printValues()
}