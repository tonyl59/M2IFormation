
## Exercice 1 :

- Créer un nouveau projet Angular
```bash
ng new exercice1
```
- Créer un composant "counter" plus lancement du serveur (dans le dossier racine, ici exercices/exo1/exercice1)
```bash
ng g c components/counter --skip-tests
npm start
```


- Intégrer le composant dans app

Ajout du texte `<app-counter />` sur app.html
Ajout du `Counter` sur les imports sur app.ts
Pendant que j'écris `Counter`, en plein milieu ils vont me proposer de cliquer directement dessus pour rajouter au dessus du app.ts le 
`(import { Counter } from "./components/counter/counter";)`


- Le composant doit afficher un compteur qui :
    - commence à 0
    - qui est rouge si impair et vert si le nombre est pair
    - Ajouter 2 boutons pour incrémenter et décrementer le compteur

    `Voir les counter.html, counter.css & counter.ts` 



## Exercice 2 :
- Créer composant "series"

```bash
ng g c components/series --skip-tests
npm start
```
- Créer route du composant series + route composant counter
 -> Voir `app.routes.ts`   

- Creer barre de navigation
 -> Voir le dossier `navbar/`

- Dans series, creer une liste de series en dur

- Afficher liste de series
- Afficher message si liste vide
- Ajouter bouton de suppression sur chaque element de la liste

## Exercice 3 :
- Créer un pipe personnalisé, qui prend en paramètre une liste, et argument de type string 'order' ('asc' ou 'desc')
- Utiliser ce pipe sur la liste de série pour la trier
- Ajouter 2 boutons pour modifier l'ordre du tableau

 -> Voir `utils/order` & modifs sur `series.ts` & `series.html`

 ## Exercice 4 :

- Créer un composant librairie, et sa route

```bash
ng g c components/library --skip-tests
```
+ rajout de `{path: "library", component: Library}` dans app.routes.ts & rajout de la ligne suivante sur `navbar.html`
```html
<li>
    <a routerLink="/library">Library</a>
</li>
``` 

- Dans ce composant, afficher une liste de livre
    - title
    - author
    - isRead
- quand le livre est lu, on affiche 👍 ou 👎 (windows + . pour ajouter l'emoji)
- Utiliser un pipe perso pour la gestion de l'emoji

```bash
ng g p  utils/emojiManager --skip-tests
```
- Ajouter un bouton pour marquer un livre lu / pas lu