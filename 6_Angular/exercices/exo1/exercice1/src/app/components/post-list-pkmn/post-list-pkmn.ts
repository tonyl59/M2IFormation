import { Component, OnDestroy, OnInit } from '@angular/core';
import { Pokapi } from '../../utils/services/pokapi';
import { Pokemon } from '../../utils/types/pokemon.type';
import { error } from 'node:console';
import { FormsModule, FormGroup, FormControl, FormArray, Validators, ReactiveFormsModule} from '@angular/forms';

@Component({
  selector: 'app-post-list-pkmn',
  imports: [FormsModule,ReactiveFormsModule],
  templateUrl: './post-list-pkmn.html',
  styleUrl: './post-list-pkmn.css'
})
export class PostListPkmn implements OnInit, OnDestroy{
  apidata : any = ''
  constructor(private pokapiService : Pokapi){}
  
  ngOnInit(): void {
    this.pokapiService.getPosts().subscribe({
      next: data => {
        //console.log(data);
        this.apidata = data;
        console.log(typeof(this.apidata))
        console.log(this.apidata.results)
      },
      error: err => console.error(err)
    })
  }
  


  // à la destruction du composant
  ngOnDestroy(): void {
    console.log("On destroy");
  }


  search_form : FormGroup = new FormGroup({
    searchId : new FormControl(0)}
  )
  search_result : any = 'Please search a pokemon'
  searchPokemon(): void {
    const url : string = this.apidata.results[this.search_form.value.searchId-1].url
    this.pokapiService.addUrl(url).subscribe({
      next: data => {
        this.search_result = data
        console.log(this.search_result)},
        error: err => console.error(err)
      }
    )
    //this.search_result = this.apidata.results[this.search_form.value.searchId-1]
    
  }
}


  
  


 




  

