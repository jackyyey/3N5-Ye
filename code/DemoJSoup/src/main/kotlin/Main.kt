package org.ye

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    // Connect to the Wikipedia homepage and get the document
    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()

    // Log the document's title
    println(doc.title())

    // Select the news headlines from the document
    val newsHeadlines: Elements = doc.select("#mp-itn b a")

    // Iterate over each headline element and log its title and absolute URL
    for (headline in newsHeadlines) {
        println("%s\n\t%s".format(headline.attr("title"), headline.absUrl("href")))
    }
}
