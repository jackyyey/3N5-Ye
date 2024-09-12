package org.ye

import org.magicwerk.brownies.collections.GapList
import java.util.LinkedList
import java.util.Random
import javax.swing.text.GapContent

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var init = System.currentTimeMillis()
    testeCetteListe(LinkedList())
    testeCetteListe(ArrayList())
    testeCetteListe(GapList())
    var end = System.currentTimeMillis()-init
    println("time = $end")
}

fun testeCetteListe(liste: MutableList<Int>) {
    val random: Random = Random(1234)
    val a = System.currentTimeMillis()
    // ajouter 100 000 elements en dernière position liste.add(nombre);
    for (i in 0..100000){
        liste.add(5)
    }
    val b = System.currentTimeMillis()
    // ajouter 100 000 elements en première position liste.add(0, nombre);
    for (i in 0..100000){
        liste.add(0, 20)
    }
    val c = System.currentTimeMillis()
    // ajouter 100 000 elements position au hasard liste.add(random.nextInt(liste.size + 1), nombre);
    for (i in 0..100000){
        liste.add(random.nextInt(liste.size+1), 10)
    }
    val d = System.currentTimeMillis()
    // afficher b-a, c-b, d-c qui sont les durées d'exécution en millisecondes
    println(b-a)
    println(c-b)
    println(d-c)
}

