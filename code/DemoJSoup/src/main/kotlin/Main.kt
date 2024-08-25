package org.ye

import org.jsoup.Jsoup



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()
    log(doc.title())
    val newsHeadlines: Elements = doc.select("#mp-itn b a")
    for (headline in newsHeadlines) {
        log(
            "%s\n\t%s",
            headline.attr("title"), headline.absUrl("href")
        )
    }

}