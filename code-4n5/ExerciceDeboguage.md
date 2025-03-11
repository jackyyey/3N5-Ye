## 1.
Le accepted media type est de type string et non JSON, il ne lancera dont pas le service.

## 2.
Le serveur retourne un IllegalStateException car le ligne de code ```total += ((i+1) / (i % nombre)); ``` divise un nombre par 0

## 3.
La requête semble fonctionner parce qu'il retourne "Success" même si rien fonctionne. La méthode qui pose problème est la méthode calculerMoyenneSalaires car elle essaie d'ajouter une valeur à une variable Long
dont la valeur est la valeur maximum que peut contenir un Long, ce qui retourne l'exception de type ArithmeticException.


