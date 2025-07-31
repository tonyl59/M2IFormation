import { Component, Input, Output, EventEmitter } from '@angular/core';


interface User {
  nom : string,
  age : number
}

@Component({
  selector: 'app-enfant',
  imports: [],
  templateUrl: './enfant.html',
  styleUrl: './enfant.css'
})
export class Enfant {
  @Input() message! : string
  @Input() user! : User

  @Output() dataEmitted = new EventEmitter<string>()  

  sendData() {
    this.dataEmitted.emit("Hello depuis le composant enfant !")
  }
}
