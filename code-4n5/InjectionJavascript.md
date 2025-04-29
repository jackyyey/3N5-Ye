## Faille 

Le serveur est vulnérable aux Injecitions Javascripts

## Attaque (exploit)


- Créer un compte avec une balise <script>alert("pppp")</script> comme nom en envoyant une requête post /api/task/signup
- Ouvrir la page index du serveur
- En rechargeant la page, on constate que le numéro de téléphone a été modifié


## Correctif 1

Au lieu d'utiliser des balises html dans l'action, j'ai simplement retourné la liste des utilisateurs et la page html les traitent
