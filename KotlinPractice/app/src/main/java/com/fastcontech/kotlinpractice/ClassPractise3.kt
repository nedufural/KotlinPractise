package com.fastcontech.kotlinpractice

enum class Color (rgb:Int){
    RED(122222),
    GREEN(122222),
    BLUE(122222)
}

enum class Color2 {
    RED,
    GREEN,
    BLUE
}
/**
 * Sealed classes can only be accessed from the same file
 * all subclasses are in the same file
 * */
sealed class ClassPractise3

object SealLion : ClassPractise3()
object Walrus : ClassPractise3()

fun checkSealedClass(seal:ClassPractise3): String{
  return  when(seal){
        is Walrus -> "Walrus"
        is SealLion -> "Seal Lion"
    }
}

fun main(){
    println(  checkSealedClass(SealLion))
}