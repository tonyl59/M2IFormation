import { Routes } from '@angular/router';
import { Home } from './pages/home/home'
import { Blocks } from './pages/blocks/blocks';
import { Counter } from './components/counter/counter';
import { Series } from './components/series/series';
import { Pipes } from './components/pipes/pipes';
import { Library } from './components/library/library';
import { Formulaire } from './components/formulaire/formulaire';
import { Pokemon } from './components/pokemon/pokemon';
import { PostListPkmn } from './components/post-list-pkmn/post-list-pkmn';
export const routes: Routes = [
    {path: "", component: Home},
    {path: "blocks", component: Blocks},
    {path: "pipes", component: Pipes},
    {path: "form", component: Formulaire},
    {path: "counter", component: Counter},
    {path: "series", component: Series},
    {path: "library", component: Library},
    {path: "pokemon", component: Pokemon},
    {path: "post-list-pkmn", component: PostListPkmn}

];
