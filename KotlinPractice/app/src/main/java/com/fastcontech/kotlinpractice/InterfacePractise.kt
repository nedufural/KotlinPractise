package com.fastcontech.kotlinpractice

class InterfacePractise :Interface,Abstract(){
    override var size: Int
        get() {
            return 0
        }
        set(value) {
            println("values id $value") }

    override fun sum() {
        println("Sum Interface")
    }


}
fun main(){
    val abIn = InterfacePractise()
    abIn.minus()
    abIn.multiply(5)
    abIn.sum()
    abIn.divide(5)

}
/**
 * Interfaces in kotlin can have
 * 1. Variables
 * 2. Non implemented functions
 * 3. Implemented functions
 * 4. All variables and functions must be overridden by the implementing class
 */

interface Interface {
    var size:Int
    fun sum()
    fun divide(num:Int)= 6/num
}
/**
 * Abstract in kotlin can have
 *
 * 1. Non implemented functions
 * 2. Implemented functions
 * Can not have
 * 3. Variables
 * 4. All functions may or may not be overridden by the extending class.
 * This point supports encapsulation of functionality
 */
abstract class Abstract {
    fun minus(){
        var sums = 2 - 3
    }
    fun multiply(num: Int) = 6 * num
}

// use key word object to make a singleton pattern in Kotlin
interface SingletonInterface{
   fun printing()
}
object Singleton:SingletonInterface{
    override fun printing() {
        println("Singleton here")
    }

}