package com.fastcontech.kotlinpractice

class ClassPractise {
    var length = 20
    var width = 40
    var height = 60

    val volume: Int
        get() {
            return length * width * height / 1000
        }

    val volume1line: Int
        get() = length * width * height / 1000

    var volumeSetGet: Int
        get() = length * width * height / 1000
        set(value) {
            length = value * 90 / value
            println(length)
        }

    fun volume() = length * width * height / 1000

}

fun get2 () = 2 //default
private fun get3 () = 3 // can only be seen inside the declaring class the same as protected
// but can be seen by subclasses
internal fun get4 () = 4 // is accessible in the module but not shipped when compile

fun buildObject() {
    val classPractise = ClassPractise()
    println(classPractise.height)
    println(classPractise.length)
    println(classPractise.width)
    println(classPractise.volume())
    println(classPractise.volumeSetGet)
    println(classPractise.volume1line)
}

fun main(args: Array<String>) {
    buildObject()
}