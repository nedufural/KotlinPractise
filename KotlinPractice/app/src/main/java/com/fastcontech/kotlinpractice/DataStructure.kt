package com.fastcontech.kotlinpractice

import android.os.Build
import androidx.annotation.RequiresApi

class DataStructure(var title: String, var author: String, var year: Int) {

    /**
     * Pairs use the
     * @param keyword "to"
     * */
    fun pairs() {
        val elements1 = "1st element" to "second element"
        val elements2 = "1st element" to "second element" to "3rd element" to "fourth element"
        val elements3 = ("1st element" to "second element") to ("3rd element" to "fourth element")
        println(elements1)
        println(elements1.first)
        println(elements1.second)
        println(elements2)
        println(elements3)
    }

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    var arrayList =
        listOf("abc", "def", "ghi", "ljk", "mno", "pqr", "stu", "vwx", "yz") // can't change
    var arrayList2 =
        mutableListOf("abc", "def", "ghi", "ljk", "mno", "pqr", "stu", "vwx", "yz") // can change

    fun collectionsListOf(): List<String> {
        //1
        arrayList2.remove("abc")
        arrayList2.add("ab")
        arrayList2.contains("ab")
        arrayList2.contains("abc")

        //2
        arrayList2.remove("ab")
        arrayList2.add(0, "abc")


        //3 sublist
        println("sublist :  ${arrayList2.subList(3, 6)}")
        println("sublist :  ${arrayList2.subList(3, arrayList2.size)}")
        val sumOfList = listOf(1, 3, 5, 7)
        val sumOfListString = listOf("a", "b", "cc")
        println("sum of list 1,3,5,7 :  ${sumOfList.sum()}")
        println("sum of list a b cc :  ${sumOfListString.sumBy { it.length }}")



        return arrayList2
    }

    var maps = mutableMapOf("a" to 1)
    var maps2 = mapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4)
    var maps3 = mapOf("a" to "1", "b" to "2", "c" to "3", "d" to "4")

    @RequiresApi(Build.VERSION_CODES.N)
    fun collectionsMapOf() {
        maps["b"] = 2
        maps["c"] = 3
        maps["d"] = 4
        maps["e"] = 4
        maps.remove("e")
        println(maps)
        //getDefault adding default fault
       println( maps3.getOrDefault("e", "I don't know"))

    }

    fun morePractise(){
        val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
        val library = mapOf("Shakespeare" to allBooks)
        println(library.any { it.value.contains("Hamlet") })

        val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
        moreBooks.getOrPut("Jungle Book") { "Kipling" }
        moreBooks.getOrPut("Hamlet") { "Shakespeare" }
        println(moreBooks)
    }
}

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val dataStructure = DataStructure("Climbing to the top", "Chinedu Agwu", 2021)
    dataStructure.pairs()
    val var1 = dataStructure.getTitleAuthor()
    val var2 = dataStructure.getTitleAuthorYear()
    val (ele1, ele2, ele3) = dataStructure.getTitleAuthorYear()

    println(var1)
    println(var2)

    println(ele1)
    println(ele2)
    println(ele3)

    println(dataStructure.collectionsListOf())
    dataStructure.collectionsMapOf()
}