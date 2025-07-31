import { Component } from '@angular/core';
import { FormArray, FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators  } from '@angular/forms';
import { PokemonCard } from '../pokemon-card/pokemon-card';
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
  selector: 'app-pokemon',
  imports: [FormsModule, ReactiveFormsModule, PokemonCard],
  templateUrl: './pokemon.html',
  styleUrl: './pokemon.css'
})
export class Pokemon {

  thunderbolt : Attack = {nameA: "Thunderbolt", descriptionA: "An electric damaging attack, has 10% chance to paralyze", damage: 90, type: "electric"}
  bodyslam : Attack = {nameA: "Body Slam", descriptionA: "The user drops onto the target with its full body weight. This may also leave the target with paralysis.", damage: 85, type: "normal"}
  vinewhip : Attack = {nameA: "Vine Whip", descriptionA: "The target is struck with slender, whiplike vines to inflict damage.", damage: 45, type: "grass"}
  
  pokemons : Pkmn[] = [
    {id : 0, nameP: "Pikachu", descriptionP: "Electric Mouse", types: ["electric"], attacks: [this.thunderbolt, this.bodyslam]},
    {id : 1, nameP: "Bulbasaur", descriptionP: "Plant Frog", types: ["grass", "poison"], attacks: [this.vinewhip, this.bodyslam]}
  ]

    pokemon_form : FormGroup = new FormGroup({
      id : new FormControl(""),
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
    if (this.attacks.length <4){
      this.attacks.push(new FormGroup({
        nameA : new FormControl(""),
        descriptionA : new FormControl(""),
        damage: new FormControl(0), 
        type : new FormControl("")
    }))}
  }

  count : number = 1
  savePokemon() : void {
      this.count ++
      this.pokemon_form.value.id = this.count 
      this.pokemons.push(this.pokemon_form.value)
      this.pokemon_form.reset()

      // Clearing the whole attack list/form and putting back the first empty attack form
      this.attacks.clear()
      this.addAttack()
    
  }

  types: string[] = ["water", "fire", "grass", "electric", "normal", "dragon", "flying", "ice", "bug", "rock", "ghost", "poison" ,"steel", "dark", "fairy", "psychic", "fighting", "ground"]
  

  parentMessage : string = "Hello depuis le composant parent !"
  delete(index: number){
      this.pokemons = this.pokemons.filter(p => p.id !== index ) // "this.listTest.filter((_,i) => i != index" fonctionnerait aussi. C'est la même en opti mais filter est plus lisible (surtout qu'on peut confondre splice, slice etc
  }

  receiveData : string = ""

  handleData(data : string) : void {
    this.receiveData = data
    //var dataToId : number = +data.substring(data.length - 1)
    var dataToId : number = +data.split("°")[1]
    this.delete(dataToId)
  }
}




  