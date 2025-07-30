import { Component } from '@angular/core';
import { FormArray, FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators  } from '@angular/forms';

  interface Attack {
    nameA: string,
    descriptionA: string
    damage: number,
    type: string
}
  interface Pkmn {
    nameP: string,
    descriptionP: string
    types: string[],
    attacks: Attack[]
}



@Component({
  selector: 'app-pokemon',
  imports: [FormsModule, ReactiveFormsModule],
  templateUrl: './pokemon.html',
  styleUrl: './pokemon.css'
})
export class Pokemon {

  thunderbolt : Attack = {nameA: "Thunderbolt", descriptionA: "An electric damaging attack, has 10% chance to paralyze", damage: 90, type: "electric"}
  bodyslam : Attack = {nameA: "Body Slam", descriptionA: "The user drops onto the target with its full body weight. This may also leave the target with paralysis.", damage: 85, type: "normal"}
  vinewhip : Attack = {nameA: "Vine Whip", descriptionA: "The target is struck with slender, whiplike vines to inflict damage.", damage: 45, type: "grass"}
  
  pokemons : Pkmn[] = [
    {nameP: "Pikachu", descriptionP: "Electric Mouse", types: ["electric"], attacks: [this.thunderbolt, this.bodyslam]},
    {nameP: "Bulbasaur", descriptionP: "Plant Frog", types: ["grass", "poison"], attacks: [this.vinewhip, this.bodyslam]}
  ]

    pokemon_form : FormGroup = new FormGroup({
      nameP: new FormControl("",[Validators.required]),
      descriptionP : new FormControl(""),
      types : new FormControl([]),
      attacks : new FormArray([
        new FormGroup({
          nameA : new FormControl(""),
          descriptionA: new FormControl(""),
          damage : new FormControl(0),
          type : new FormControl("")
        })
      ])
    }, [Validators.required]
  )



  get attacks() {
    return this.pokemon_form.controls["attacks"] as FormArray
  }

  addAttack() : void {
    this.attacks.push(new FormGroup({
      nameA : new FormControl(""),
      descriptionA : new FormControl(""),
      damage: new FormControl(0), 
      type : new FormControl("")
    }))
  }

  savePokemon() : void {
      console.log("Pokemon: ", this.pokemon_form.value);
      this.pokemons.push(this.pokemon_form.value)
      this.pokemon_form.reset()
    
  }

   types: string[] = ["water", "fire", "grass", "electric", "normal", "dragon", "flying", "ice", "bug", "rock", "ghost", "poison" ,"steel", "dark", "fairy", "psychic", "fighting", "ground"]
  
}

  