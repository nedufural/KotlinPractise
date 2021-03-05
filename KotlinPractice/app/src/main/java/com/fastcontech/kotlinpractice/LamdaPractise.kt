package com.fastcontech.kotlinpractice

var dance = { println("dancing") } // assign a lambda to a variable

/**
 * Lambda taking parameters
 * */

val lambdaParameter = { value: Int -> value / 2 }

val lambdaWithParameterAndReturnType: (Int) -> Int = { value -> value / 2 }

fun namedFunction(num:Int) = num + 20

fun multiple(num:Int):Int{
    return 2 * num
}

/***
 * update value function simply takes
 * @param value1
 * and
 * @param operation which is any non lambda function
 *
 */

fun updateValue(value1: Int, operation: (Int) -> Int): Int {
    return operation(value1)
}


var num = 20
fun processor() {
    num = updateValue(num, lambdaWithParameterAndReturnType)
    num = updateValue(num, ::namedFunction) // since namedFunction is not a lambda we use :: to call it
    num = updateValue(num, ::multiple) // since multiple is not a lambda we use :: to call it
    //and it should take a parameter of it "num"
    num = updateValue(num) { num ->
        num + 20
    }
}
fun randomx():Int{
    return 20
}

val random1 = randomx()
val random2 = {randomx()}


fun main() {
    dance() // calling dance as a regular function
    println(lambdaParameter(20))
    println(lambdaWithParameterAndReturnType(20))
    println(random1)
    println(random2)

}