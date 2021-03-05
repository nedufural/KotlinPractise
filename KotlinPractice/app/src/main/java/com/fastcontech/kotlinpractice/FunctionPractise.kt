package com.fastcontech.kotlinpractice


fun returnSingleExpression(day: Int) = day > 1
fun returnSingleExpression2() = 1
fun returnSingleExpression3() = 2

fun defaultValueFunctions(day: String, user: String = "ken", userNumber: Int = 1) {
    println("Day $day when user $user and user number $userNumber")
}

fun defaultValueFunctions2(day: String, user: String = "ken", userNumber: Int = returnSingleExpression3()) {
    println("Day $day when user $user and user number $userNumber ")
}

fun randomDay(day: Int) {
    val firstDay = day >= 1
    val secondDay = day >= 2
    val thirdDay = day >= 3
    val fourthDay = day >= 4
    val fifthDay = day == 5
    when {
        firstDay -> println("Monday")
        secondDay -> println("Tuesday")
        thirdDay -> println("Wednesday")
        fourthDay -> println("Thursday")
        fifthDay -> println("Friday")
        else -> println("Saturday")
    }
}

/**
 * Expensive operations include file reading or allocating memory
 * Here are a few
 * */

fun newFunction() = print("Testing expensive functions")
//If a parameter is not passed it will create new newFunction()
//If called multiple times it will create multiple new functions and run out of memory
fun testNewFunction(newFun:Any = newFunction()){

}

fun main(args: Array<String>) {
    randomDay(3)
    defaultValueFunctions("Tuesday", "agwuena", 3)
    defaultValueFunctions2("Thursday", "nedufural")
    defaultValueFunctions("Wednesday") // the default values
    val result: Boolean = returnSingleExpression(3)
    val result2: Int = returnSingleExpression2()
    println(result)
    println(result2)
}