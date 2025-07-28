import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Counter } from "./components/counter/counter";
import { Navbar } from './components/navbar/navbar';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Counter, Navbar],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('exercice1');
}
