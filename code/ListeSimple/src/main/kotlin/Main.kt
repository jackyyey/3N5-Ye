package org.Ye

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(repete(4,2))
    println(repete(6,3))
    println(repete(8,4))
}
fun repete(n: Int, nombreFois: Int): List<Int> {
    var numList = mutableListOf<Int>()
    for (i in 1..n)
    {
        for (j in 1..nombreFois)
        {
            numList.add(i)
        }
    }
    return numList
}