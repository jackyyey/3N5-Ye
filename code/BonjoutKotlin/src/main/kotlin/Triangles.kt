package org.ye

fun main(){
    println(triangle(4))
}
fun triangle(hauteur : Int) : String {
    val triangleString = ""
        for (i in 1..hauteur) {
            val triangleIncomplet = "*"
            for (j in 1..i) {
                triangleIncomplet+"*"
            }
            triangleIncomplet + "/n"
            triangleString + triangleIncomplet
        }
    return triangleString
}

