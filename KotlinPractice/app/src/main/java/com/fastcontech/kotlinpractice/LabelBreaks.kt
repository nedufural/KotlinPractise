package com.fastcontech.kotlinpractice

//any word can be used as a label stopping, loop etc...
class LabelBreaks {
    fun labelBreak(){
        stopping@for(i in 0..20){
            for (n in 0..20){
                println(n)
                if(n >= 5) break@stopping
            }
        }
    }

}
fun main(){
    val obj = LabelBreaks()
    obj.labelBreak()
}