## Commandes de bases

- Installer Angular :

```bash
npm install -g @angular/cli
```

- Création d'un nouveau projet :

```bash
ng new <nom_projet>
```
- Récupération d'un projet existant :
    - Installer les dépendances avec `npm install` ou `npm -i`
    - On lance le server avec `npm start` ou `ng serve`

- Création d'un nouveau composant pour éviter de créer le fichier de test (spec.ts), il faut ajouter à l'option
`--skip-tests`

```bash
ng g c dossier/nom-composant --skip-tests
```

Plus concretement j'ai fait ça pour la démo :

```bash
ng g c components/presentation --skip-tests
```

Après ça on peut trouver ce qu'on a crée dans src->app->components

## L'interpolation

C'est le fait d'interpréter du ts dans le template. Pour ça, on utilise les balises `{{}}. On peut afficher n'importe quelle expression js tant qu'elle retourne quelque chose. 

## Data Binding
Permet d'interprêter du js dans les attributs HTML. On peut interpreter du js dans n'importe quel attribut à condition de mettre l'attribut entre
crochets.

```angular2html
<img [src]="nom_variable">
```

## Le router
Pour créer des "routes", on les définits dans le fichier `app.routes.ts` sous la forme d'un objet qui contient un path (le chemin dans l'url) et le composant à affichier

```ts
export const routes: Routes = [
    {path: "/home", component: HomeComponent},
    {path: "", component: ListComponent}
]

Tony : Avant de faire les routes, je crée donc deux composants avant (dans le dossier "exo/exercice1")
```bash
ng g c components/navbar --skip-tests
ng g c pages/home --skip-tests
ng g c pages/blocks
```
Puis je rajoute les imports home et blocks sur `app.routes.ts`


## Les pipes
Les pipes `|` sont des fonctions qui prennent en valeur une entrée, et qui retourne la valeur transformée. Il y a des pipes pour le texte `uppercase`, `lowercase`, `titlecase`

Je crée un composant pipe sur le dossier `exo/exercice1`
```bash
ng g c components/pipes --skip-tests
```

```bash
ng g p  utils/uppertable --skip-tests
```