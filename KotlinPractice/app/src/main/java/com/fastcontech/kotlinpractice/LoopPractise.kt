package com.fastcontech.kotlinpractice

import java.util.*

class LoopPractise {
    //Untyped List
    private val myListUnTyped = mutableListOf(10, 20)

    //Untyped Mix List
    private val myListUnTyped2 = mutableListOf(10, "20")

    //Typed List
    private val myListStringTyped = mutableListOf<String>("10", "20")
    private val myListIntType = mutableListOf<Int>(10, 20)

    // Mix List
    private val listOfArrays = listOf(10, 20, "30")

    //Typed Mix List
    private val listOfArrays2 = listOf<Int>(10, 20, 30)

    private val arr = intArrayOf(1, 2, 3)
    private val arr2 = arrayOf(1, 2, "")

    //Array of Arrays
    private val arrayOfArrays = arrayOf(listOfArrays, arr, arr2)

    private val arr3 =
        Array(5) { 1;2;3;4;5 }// all previous values are ignored only last value 5 is used
    private val arr4 = Array(5) { 5 } // this prints only 5 five times
    private val arr5 = Array(5) { it * 2 } // this increase by 2 from 0,2,4....

    fun arraysUse() {
        println(myListUnTyped)
        println(myListStringTyped)
        println(myListUnTyped2)
        println(myListIntType)
        println(myListUnTyped)
        println(intArrayOf(1, 2, 3).contentToString())
        println(arrayOfArrays.contentToString())
        println(listOfArrays2)
        println(arr3.asList())
        println(arr4.asList())
        println(arr5.asList())
    }

    fun forUse() {
        for (element in arr5) {
            println(element)
        }
        for ((index, elements) in arr5.withIndex()) {
            println("The index is $index while the element is $elements")
        }
        for (i in 1..5) {
            println(i)
        }
        for (i in 5 downTo 1) {
            println(i)
        }
        for (i in 1..10 step 2) {
            println(i)
        }
        for (i in 'a'..'d') {
            println(i)
        }
    }

    fun ifUse() {
        val num = 20
        val temperature = 10
        if (num in 1..50) {
            println("True")
        }
        whenUse()

        val value = temperature > 20
        println("value is $value")
    }

    private fun whenUse() {
        val welcomeMessage = "Hello and welcome to Kotlin"
        when (welcomeMessage.length) {
            0 -> println("Nothing to say?")
            in 1..50 -> println("Perfect")
            else -> println("Too long!")
        }
    }

    fun dayOfWeek() {
        println("What day is it today?")
        val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        println(
            when (day) {
                1 -> "Sunday"
                2 -> "Monday"
                3 -> "Tuesday"
                4 -> "Wednesday"
                5 -> "Thursday"
                6 -> "Friday"
                7 -> "Saturday"
                else -> "Time has stopped"
            }
        )
    }

    fun whileUse() {
        var sum = 0
        var sum1 = 0
        while (sum >= 0 && sum < 10) {
            sum++
        }
        while (sum1 in 0..9) {
            sum1++
        }
        println("sum $sum")
        println("sum1 $sum")

    }

    fun repeatUse() {
        var fortune: Int = 1
        repeat(10) {
            println("\nYour fortune is: $fortune")
            fortune++
        }
    }

    fun filterUse() {
        var listFilter = listOf<String>(
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        )
        /**
         * Below is an eager example of filter meaning that a new list is created every
         * time filter is called
         * */
        println(listFilter.filter { true })
        println(listFilter.filter { it[0] == 'S' }) // check the element with 1st letter S
        println(listFilter.filter { it[1] == 'a' }) // check the element with 2st letter a
        listFilter.map {
            println(it)
        }
        /**
         * Lazy example only keeps a sequence and knowledge of the list
         * */
        println(listFilter.asSequence().filter { true }) // prints all the values inside the list
        println(listFilter.asSequence().filter { it[0] == 'S' } // prints all values with 'S' at position 0
            .toList()) // to convert sequence back
        // to list to visualize the lsit
        println(listFilter.asSequence().filter { it[1] == 'a' }// prints all values with 'a' at position 1
            .toList()) // to convert sequence back to list

        var testFilterLazy = listFilter.asSequence().map {
            println(it)
            it
        } // print all values 1 after another
        println(" lazy ${testFilterLazy.first()}")
        println("lazy2: {${testFilterLazy.toList()}")

        println(listFilter.filter { it.contains("Sun") }.sortedBy { it.length }) // prints all values that contains 'Sun' and sort by length
        println(listFilter.filter { it.startsWith('T') }.filter { it.endsWith('y') })// prints all values that start with 'T' and ends with 'y'

    }
}

fun main(args: Array<String>) {
    val loopPractise = LoopPractise()
    // loopPractise.forUse()
    // loopPractise.arraysUse()
    // loopPractise.ifUse()
    // loopPractise.dayOfWeek()
    // loopPractise.whileUse()
    // loopPractise.repeatUse()
    // loopPractise.filterUse()

}