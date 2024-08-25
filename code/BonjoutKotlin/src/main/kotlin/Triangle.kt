package org.ye

fun main(args: Array<String>) {
    for (strings: String in args) {
        val nb: Int = strings.toInt()
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


}