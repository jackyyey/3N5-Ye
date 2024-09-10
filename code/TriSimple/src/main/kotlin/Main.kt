package org.Ye

import java.nio.DoubleBuffer

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var liste: List<Double> = listOf(2.3,4.3,4.0,2.0,1.0)
    println(triInverseALamain(liste))
    println(triInverse(liste))
}
fun triInverseALamain(liste: List<Double>): List<Double>{
    var listeMutable = liste.toMutableList()
    for (i in 0..listeMutable.size/2)
    {
        var listeCourant = listeMutable.get(i)
        listeMutable[i] = listeMutable[listeMutable.size-1-i]
        listeMutable[liste.size-1-i] = listeCourant
    }
    return listeMutable
}
fun triInverse(liste: List<Double>): List<Double>{
    return liste.reversed()
}