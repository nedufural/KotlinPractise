package com.fastcontech.kotlinpractice

import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberFunctions

class AnnotationPractise2 {
    fun sum(){}
    fun divide(){}
}

@ImAno class AnnotationPractise3 {
    fun sum(){}
    fun divide(){}
    @get :OneGet
    val gettingVariable = true
    @set :OneSet
    var settingVariable = false
}
//simplest form of annotation
annotation class ImAno
@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OneGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OneSet

//using reflections to get class names and function
fun reflections(){
 val classObj = AnnotationPractise2::class
 val classObj2 = AnnotationPractise3::class
    for (method in classObj.declaredMemberFunctions){
        println(method.name)
    }

    for (classname in classObj2.annotations){
        println(classname.annotationClass.simpleName)
    }
}
fun main(){
    reflections()
}