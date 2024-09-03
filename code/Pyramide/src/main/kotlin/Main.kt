package org.ye

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    for(PyramideHauteur in args)
    {
        Pyramide(PyramideHauteur.toInt())
    }
}

fun Pyramide(hauteur:Int){
    var nbEtoile = 1
    for (col in 1..hauteur)
    {
        var espace = hauteur-col
        for (i in 1..espace)
        {
            print(" ")
        }
        for(j in 1..nbEtoile)
        {
            print("*")
        }
        nbEtoile+=2
        println()
    }
}