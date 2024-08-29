package org.ye

import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var tabAleatoire = creeTableauAleatoire(10)
    println(Somme(tabAleatoire))
    println(Moyenne(tabAleatoire))
    println(Max(tabAleatoire))
    println(Min(tabAleatoire))
}
fun creeTableauAleatoire(n: Int): Array<Int> {
    var tabIntAleatoire = emptyArray<Int>()
    for (i in 0..n)
    {
        tabIntAleatoire += Random.nextInt(0,100)
    }
    return tabIntAleatoire
}

fun Somme(n: Array<Int>): Int{
    var nb = n[0]
    for (i in 0..n.size-1)
    {
        nb+=n[i]
    }
    return nb
}

fun Moyenne(n: Array<Int>): Int{
    var nb = n[0]
    for (i in 0..n.size-1)
    {
        nb+=n[i]
    }
    return nb/n.size
}

fun Max(n: Array<Int>): Int{
    var nb = n[0]
    for (i in 0..n.size-1)
    {
        if (n[i]>=nb)
        {
            nb = n[i]
        }
    }
    return nb
}

fun Min(n: Array<Int>): Int{
    var nb = n[0]
    for (i in 0..n.size-1)
    {
        if (n[i]<=nb)
        {
            nb = n[i]
        }
    }
    return nb
}

