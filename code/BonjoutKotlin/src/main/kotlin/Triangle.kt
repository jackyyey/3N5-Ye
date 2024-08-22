package org.ye

fun main(){
    val nb = 4
    val triangle = buildString {
        for (i in 1..nb){
            for (j in 1 .. i){
                append("*")
            }
            appendLine()
        }
    }

    println(triangle)
}