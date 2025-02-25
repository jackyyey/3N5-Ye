## Q1
On a un serveur qui attend une requête - en méthode GET - reçoit un nombre dans <br> l'url par exemple 4 - renvoie les 4 premiers nombres de la suite de Fibonacci - par exemple pour <br> l'URL https://superserveur.ca/fibo/4 le serveur renvoie [0, 1, 1, 2]

``` kotlin
@GET(fibo/4)
fun getFibo(@Path nombre: Int): List<Int>
```

## Q2
``` kotlin
fun main() {
 var a = 100
 a += double(a) + (3 * triple(8))
 println(a)
}
fun double(x: Int): Int {
 val z = x * 2
 return z
}
fun triple(a: Int): Int {
 return a * 3
}
```
### TRACE
|        Ligne exécutée     |         effet           |        stack        |
|-------------|--------|----------|
| var a = 100 | a: 100 | __Main__ |
| a += double(a) + (3 * triple(8)) | appelle de la fonction double avec x = a et ensuite la méthode triple avec a = 8, a : 100 | __Main__ |
| val z = x * 2 | x: 100, z: 200 | __double__ <br> Main |
| return z | retourne la valeur de z, z: 200 | __double__ <br> Main |
| return a * 3 | retourne la valeur de a fois 3 | __triple__ <br> Main |
| a += double(a) + (3 * triple(8)) | a: 372 | __Main__ |
| println(a) | retourne la valeur de a dans la console | __Main__ |

 
