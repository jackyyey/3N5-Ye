fun main() {
    val a = 5 + 2 * 2
    for (i in 1..2) {
        for (j in 4..6) {
            println((i + j).toString() + (i.toString() + " " + a))
        }
    }
}


| ligne exécutée | effet                             |
|-----------------|-----------------------------------|
| val a = 5 + 2 * 2       | a: 9                             |
| for (i in 1..2)       | i parcourt l'interval 1 et 2                     |
| for (j in 4..6) | j partcourt l'interval 4, 5, 6 |
| println((i + j).toString() + (i.toString() + " " + a)) | i: 1, j: 4, a: 9, <br> affiche 51 9|
| println((i + j).toString() + (i.toString() + " " + a)) | i: 1, j: 5, a: 9, <br> affiche 61 9|
| println((i + j).toString() + (i.toString() + " " + a)) | i: 1, j: 6, a: 9, <br> affiche 71 9|
| for (j in 4..6) | j partcourt l'interval 4, 5, 6 |
| println((i + j).toString() + (i.toString() + " " + a)) | i: 2, j: 4, a: 9, <br> affiche 62 9|
| println((i + j).toString() + (i.toString() + " " + a)) | i: 2, j: 5, a: 9, <br> affiche 72 9|
| println((i + j).toString() + (i.toString() + " " + a)) | i: 2, j: 6, a: 9, <br> affiche 82 9|
