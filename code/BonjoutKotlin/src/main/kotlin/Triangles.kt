package org.ye

fun main(){
    for (i in 1..5)
    {
        println(triangle(4))
    }
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

