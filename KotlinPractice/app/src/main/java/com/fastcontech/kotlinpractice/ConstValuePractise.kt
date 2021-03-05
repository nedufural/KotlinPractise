package com.fastcontech.kotlinpractice

import com.fastcontech.kotlinpractice.ConstValuePractise

const val num1 = 7 // is assigned at compilation time and only determined with classes with and top level of a class and Singleton "object"
val num2 = 8 // can be assigned during execution

object ConstValuePractise {
    const val num4 = 10
    fun accessConstVal(){
        println(num1)
    }
}
class  ConstValuePractise2 {

    fun accessConstVal(){
        println(num2)
    }
}

//To access them in a function at execution time

class Constants{
    companion object{
        const  val  CONSTANT = 9
    }
}
fun main(){
    val constValuePractise = ConstValuePractise2()
    constValuePractise.accessConstVal()
    ConstValuePractise.accessConstVal()


    ConstValuePractise.num4
    Constants.CONSTANT
}