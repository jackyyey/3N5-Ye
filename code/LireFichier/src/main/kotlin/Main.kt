package org.Ye

import java.io.File
import java.nio.file.Paths
import kotlin.io.path.Path
import kotlin.io.path.exists

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    for (file in args){
        var Fichier: File = File(file)
        if (Fichier.exists())
        {
            var contenuFichier = Fichier.readText().split("\n")
            var text1 = contenuFichier.joinToString("-----------")
            print(text1)
        }
    }
}