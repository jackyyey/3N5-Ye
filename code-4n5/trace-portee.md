```kotlin showLineNumbers
fun main() {
    val a = 5
    val b = 10
    val resultat = calcul(a, b)
}

fun calcul(x: Int, y: Int): Int {
    val z = x + y
    val zz = double(z)
    return zz
}

fun double(n: Int): Int {
    val nombreDouble = n * 2
    return nombreDouble
}
```
### Trace
| ligne exécutée | effet                             | Stack |
|-----------------|-----------------------------------|--------------|
| val a = 5      | a: 5                             | __Main__ |
| val b = 10      | b: = 10                             | __Main__ |
| val resultat = calcul(a, b)      | a: 5, b: 10, appelle la fonction calcul   | __Main__ |
| val z = x + y| x = 5, b = 10, z = 15   | __**calcul**__ <br>Main |
| val zz = double(z) |z: 15, appelle la fonction double  | __**calcul**__ <br> Main |
| val nombreDouble = n * 2 | n: 15, nombreDouble: 30  | __**double**__ <br> calcul <br> Main |
| return nombreDouble | nombreDouble: 30, retourne 30, zz: 30  | __**double**__ <br> calcul <br> Main |
| return zz | zz: 30, retourne 30, resultat: 30  |  __calcul__ <br> Main |
