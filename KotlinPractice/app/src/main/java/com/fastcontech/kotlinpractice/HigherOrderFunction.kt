package com.fastcontech.kotlinpractice

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil

class HigherOrderFunction

data class Fish(var name: String)

fun main() {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("titus")

    //Similar to ExtensionFunction
    with(fish.name) {
        println(this.capitalize())
    }

    //custom with()
    myWith(fish.name) {
        println(this.capitalize())
    }
    myWith2(fish.name) {
        println(this.capitalize())
    }

    //run returns result of executing the lambda
    println(fish.run { fish.name })
    // apply returns the object after the lambda has been applied
    println(fish.apply { fish.name })

    val fish2 = Fish("titus").apply { name = "Titus Fish" }
    println(fish2)
    println(fish2.name)

    //LET is useful for chaining manipulations together
    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })

}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

/**
 * 1.calling myWith creates an object everytime it is called this becomes expensive
when called many times, so the best thing to do is to INLINE it. This way only the content of the
of the myWith is placed in the calling function.
2. It is best to use inline in small functions as
it can increase file size if the function is big
 */
inline fun myWith2(name: String, block: String.() -> Unit) {
    name.block()
}