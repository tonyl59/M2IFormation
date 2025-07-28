import { Component } from '@angular/core';

@Component({
  selector: 'app-blocks',
  imports: [],
  templateUrl: './blocks.html',
  styleUrl: './blocks.css'
})
export class Blocks {
  isLogged : boolean = false;

  users : string[] = ["tony","tata"]

  toggleLogged() : void {
    this.isLogged = !this.isLogged
  }

}
