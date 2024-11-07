package org.ye

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    try {
        val elements = arrayOf("a", "b", "c", "d", "e")
        val elementRecherche = "c"
        val index = trouveru(elements, elementRecherche)
        println("L'élément $elementRecherche se trouve à l'index $index")
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        val elements = arrayOf("a", "b", "c", "d", "e")
        val elementRecherche = "f"
        val index = trouveru(elements, elementRecherche)
        println("L'élément $elementRecherche se trouve à l'index $index")
    } catch (e: Exception) {
        println(e.message)
    }
}
fun trouveru(elements: Array<String>, elementRecherche:String) : Int {
    for (i in 0..elements.size-1)
    {
        if (elements[i] == elementRecherche)
        {
            return i
        }
    }
    throw Exception("Élément non trouvé")
}
