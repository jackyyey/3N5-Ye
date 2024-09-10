package org.Ye

import java.io.File
import java.io.FileWriter
import java.nio.file.Paths
import java.nio.file.attribute.FileAttribute
import java.util.jar.Attributes
import javax.naming.Name
import kotlin.io.path.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var fichier: File = File("vide.txt")
    var fichierNom = File(Paths.get("").toAbsolutePath().parent.toString()+"\\Nom.txt")
    if (!fichier.exists())
    {
        fichier.createNewFile()
    }
    if (!fichierNom.exists())
    {
        fichierNom.createNewFile()
        fichierNom.writeText("Jacky Ye")
    }
    println(fichierNom.exists())
}