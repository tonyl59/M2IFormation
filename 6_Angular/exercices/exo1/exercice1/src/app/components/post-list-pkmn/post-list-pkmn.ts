import { Component } from '@angular/core';
import { FormsModule,  FormControl, ReactiveFormsModule} from '@angular/forms';
;
import { PostListPkmnCard } from '../post-list-pkmn-card/post-list-pkmn-card';

@Component({
  selector: 'app-post-list-pkmn',
  standalone: true,
  imports: [FormsModule,ReactiveFormsModule, PostListPkmnCard],
  templateUrl: './post-list-pkmn.html',
  styleUrl: './post-list-pkmn.css'
})

export class PostListPkmn{

  searchId: FormControl = new FormControl(0)
  currentId : number = 1
  message : string = ''

// Pokemon search
  //Search

  searchPokemon(): void {
    const id : number = this.searchId.value
    if (id < 1){
      this.message = "There is no pokemon with a number of 0 or below ! "
    }else if (id>1024){
      this.message = "There is no pokemon with a number of 1025 beyond !" 
    }else {
      this.currentId = id
      //console.log(this.currentId)
    }
  }

  previousPokemon(): void{
    this.currentId --
  }

  nextPokemon(): void{
    this.currentId ++
  }



}
 




  

