package org.ye

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    for(nbPyramide in args)
    {
        print(Pyramide(nbPyramide.toInt()))
    }
}

fun Pyramide(hauteur:Int): String{
    var Pyramide = ""
    var nbEtoile = 1
    for (col in 1..hauteur)
    {
        var espace = hauteur-col
        for (i in 1..espace)
        {
            Pyramide+=" "
        }
        for(j in 1..nbEtoile)
        {
            Pyramide+="*"
            Pyramide+" "
        }
        nbEtoile+=2
        Pyramide+='\n'
    }
    return Pyramide
}