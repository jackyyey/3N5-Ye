package org.ye

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    for(i in args)
    {
        println(Integer.toBinaryString(i.toInt()))
    }
}