package org.ye

import org.jsoup.Jsoup

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    for  (url in args)
    {
        var pageweb =  Jsoup.connect(url).get()
        var listeLien = pageweb.body().select("a")
        for(url in listeLien)
        {
            var lien = url.attr("href")
            println(url.text() + " = " + lien)
        }
    }
}