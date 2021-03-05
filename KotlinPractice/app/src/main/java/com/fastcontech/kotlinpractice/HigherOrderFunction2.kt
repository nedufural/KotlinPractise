package com.fastcontech.kotlinpractice

class HigherOrderFunction2 {
}
fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    print(numbers.divisibleBy {
        it.rem(2)
    })
}


fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}
/**
 * More on higher order
 * https://www.geeksforgeeks.org/kotlin-higher-order-functions/#:~:text=In%20Kotlin%2C%20a%20function%20which,Kotlin%20functions%20for%20the%20convenience.
 *
 * */