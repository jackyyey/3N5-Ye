package org.ye

fun main(){
    println(triangle(4))
    println(triangle(8))
    println(triangle(10))
    println(triangle(100))
}
fun triangle(hauteur : Int) : String {
    val triangleString = buildString {
        for (i in 1..hauteur){
            for (j in 1 .. i){
                append("*")
            }
            appendLine()
        }
    }

    return triangleString
}

