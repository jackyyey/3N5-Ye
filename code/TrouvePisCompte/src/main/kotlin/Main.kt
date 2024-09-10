package org.Ye

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


}
fun trouveALaMain(element: Int, liste: List<Int>): Boolean
{
    for (i in 0..liste.size-1)
    {
        if (liste[i] == element)
        {
            return true
        }
    }
    return false
}

fun trouve(element: Int, liste: List<Int>): Boolean
{
    return liste.contains(element)
}
fun compteALaMain(element: Int, liste: List<Int>): Int{
    var ctn = 0
    for (i in 0..liste.size-1)
    {
        if (liste[i] == element)
        {
            ctn++
        }
    }
    return ctn
}

fun compte(element: Int, liste: List<Int>): Int
{
    return liste.count { it == element}
}