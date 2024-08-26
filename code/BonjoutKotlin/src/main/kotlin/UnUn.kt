package org.ye

import kotlin.contracts.contract

fun main() {
    println(unUn("111213"))
}
fun unUn(source: String): String{
    var nombreCourant = source[0].digitToInt()
    var cnt = 1
    var nouveauString = ""
    for(i in 0 .. source.length-1)
    {
        if (i != source.length-1){
            if (nombreCourant!=source[i+1].digitToInt())
            {
                nouveauString+="$cnt$nombreCourant"
                nombreCourant=source[i+1].digitToInt()
                cnt = 1
            }
            else
            {
                cnt++
            }
        }
        else
        {
            nombreCourant=source[i].digitToInt()
            nouveauString+="$cnt$nombreCourant"
        }
    }
    return nouveauString
}


