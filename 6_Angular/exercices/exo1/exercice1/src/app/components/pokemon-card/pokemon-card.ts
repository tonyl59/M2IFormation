import { Component, Input, Output, EventEmitter } from '@angular/core';


  interface Attack {
    nameA: string,
    descriptionA: string
    damage: number,
    type: string
}
  interface Pkmn {
    id : number,
    nameP: string,
    descriptionP: string
    types: string[],
    attacks: Attack[]
}

@Component({
  selector: 'app-pokemon-card',
  imports: [],
  templateUrl: './pokemon-card.html',
  styleUrl: './pokemon-card.css'
})
export class PokemonCard {
  @Input() message! : string
  @Input() pokemon! : Pkmn

  @Output() dataEmitted = new EventEmitter<string>()  


  sendDelete(id : number){
    this.dataEmitted.emit("Deleted pokemon id n°"+id)
  }

  
}
