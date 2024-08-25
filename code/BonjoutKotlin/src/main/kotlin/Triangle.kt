package org.ye

fun main(arg: Int){
    val nb = arg
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