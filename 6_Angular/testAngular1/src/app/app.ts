import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Presentation } from './components/presentation/presentation';

@Component({
  selector: 'app-root', // nom du composant
  imports: [RouterOutlet, Presentation], // Gestion des imports
  templateUrl: './app.html', // Lien avec la page html
  styleUrl: './app.css' // Lien avec le css
})
export class App {
  protected readonly title = signal('testAngular1');
}
