package com.fastcontech.kotlinpractice

data class DataClassPractise1 (val num1:Int)
data class DataClassPractise2 (val num1:Int,val num2:Int)
data class DataClassPractise3 (val num1:Int,val num2:Int,val num3:Int)
data class DataClassPractise4(val num1:Int,val num2:Int,val num3:Int)

fun main(){

    val obj1 = DataClassPractise1(1)
    val obj2 = DataClassPractise2(1,2)
    val obj3 = DataClassPractise3(1,2,3)
    val obj4 = DataClassPractise4(1,2,3)

    println(obj1)
    println(obj2)
    println(obj3)
    println(obj3.equals(obj2))
    println(obj3.equals(obj4))
    println(obj3.equals(obj4))


    val d5 = obj4.copy()
    println(d5)
}