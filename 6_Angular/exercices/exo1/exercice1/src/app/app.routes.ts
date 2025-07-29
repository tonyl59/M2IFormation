import { Routes } from '@angular/router';
import { Home } from './pages/home/home'
import { Blocks } from './pages/blocks/blocks';
import { Counter } from './components/counter/counter';
import { Series } from './components/series/series';
import { Pipes } from './components/pipes/pipes';
import { Library } from './components/library/library';
export const routes: Routes = [
    {path: "", component: Home},
    {path: "blocks", component: Blocks},
    {path: "pipes", component: Pipes},
    {path: "counter", component: Counter},
    {path: "series", component: Series},
    {path: "library", component: Library}

];
