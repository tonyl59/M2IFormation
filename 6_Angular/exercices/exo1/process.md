- Créer un nouveau projet Angular
```bash
ng new exercice1
```
- Créer un composant "counter" plus lancement du serveur
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