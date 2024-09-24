package algo

import java.time.format.DecimalStyle

fun main() {
    // Tu peux tester la fonction en l'appelant ici.
    println(racineCarre(2F))
}

/**
 * Tu dois faire un programme en Kotlin qui calcule la racine en base 2 d'un nombre, en te basant sur le pseudo-code fourni.
 *
 * (3 points) Tu dois traduire le pseudo-code fourni pour programmer la fonction racineCarre.
 * (1 point) Tu dois inclure toutes les annotations de type sur les variables.
 */
fun racineCarre(x: Float): Float {
    var resultat: Float = 0.0F
    while ((resultat + 1) * (resultat + 1) <= x) {
        resultat++
    }
    var fractions: Array<Float> = arrayOf(0.1F,0.01F,0.001F,0.0001F)
    for (fraction in fractions)
    {
        var base: Float = resultat
        for (chiffre in 0..9)
        {
            var test: Float = base + (fraction * chiffre)
            if (test*test <= x)
            {
                resultat = test
            }
        }
    }
    return resultat
}