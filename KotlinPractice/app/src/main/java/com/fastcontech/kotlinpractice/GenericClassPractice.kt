package com.fastcontech.kotlinpractice

/**
 *Generic Types are types of Use to prevent Creation of multiple
 * function / classes with different types. Even user defined types
 *
 * They Types can be any name or letter
 * A.....T, G ... Z etc and any length
 * */
class GenericClassPractice<T>

class UserDefinedClass

fun genericFunction() {
    val vrble1 = GenericClassPractice<String>()
    val vrble2 = GenericClassPractice<Int>()
    val vrble3 = GenericClassPractice<Float>()
    val vrble4 = GenericClassPractice<Double>()
    val vrble6 = GenericClassPractice<Char>()
    val vrble7 = GenericClassPractice<UserDefinedClass>()

}



/**
 * For samples of Generic Types naming conversion
 * */
class GenericClassPractice2<G>

class GenericClassPractice3<Types>