package org.Ye

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val message = "Veuillez entrer un nombre :"
    println(message)
    while (true)
    {
        var nombre = readln().toIntOrNull()
        if (nombre != null)
        {
            println("Merci, votre nombre est $nombre.")
        }
        else
        {
            println("Ceci n’est pas un nombre, veuillez entrer un nombre :")
        }

    }
}