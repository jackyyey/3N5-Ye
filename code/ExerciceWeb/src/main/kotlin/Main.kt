package org.ye

import org.jsoup.Jsoup

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    var document = Jsoup.connect(args[0]).get()
    println(document.body().text())
}