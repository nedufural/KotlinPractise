package com.fastcontech.kotlinpractice

//open classes can be subclassed
open class ExtendedClass(val availability: Boolean) {
    fun getAvailable(): Boolean {
        // check acts like an assertion with the following error sentence
        check(!availability){
            "The availability is false!!"
        }
        return availability
    }
}

class Generics1 : ExtendedClass(true) {
    fun getAvailable2() {
        println(availability)
    }
}

class Generics2 : ExtendedClass(false) {
    fun getAvailable3() {

        println(availability)
    }
}

class MyFinalGenericClass<T : ExtendedClass>(val extendedClass: T) {
    fun printValue() {
        println(extendedClass)
    }
}

fun <T: ExtendedClass> genericFunction(variable :MyFinalGenericClass<T>){
        println("Generic Function print out is : ${variable.extendedClass.getAvailable()}")
}



fun printAllGenerics() {
    val gen1 = MyFinalGenericClass<Generics1>(Generics1())
    gen1.extendedClass.getAvailable2()
    val gen2 = MyFinalGenericClass<Generics2>(Generics2())
    gen2.extendedClass.getAvailable3()
    // Displays an exception because it is not true
    gen1.extendedClass.getAvailable()

    genericFunction(gen1)

}

fun main(){
    printAllGenerics()
}
