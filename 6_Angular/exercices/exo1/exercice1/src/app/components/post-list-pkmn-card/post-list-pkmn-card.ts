import { CommonModule } from '@angular/common';
import { Component, Input, OnChanges, SimpleChanges} from '@angular/core';
import { Pokapi } from '../../utils/services/pokapi';
import { Pokemon } from '../../utils/types/pokemon.type';
@Component({
  selector: 'app-post-list-pkmn-card',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './post-list-pkmn-card.html',
  styleUrl: './post-list-pkmn-card.css'
})
export class PostListPkmnCard implements OnChanges{
  @Input() cId!: number;
  p!: Pokemon

  constructor(private pokApi: Pokapi){}

    ngOnChanges(changes: SimpleChanges): void {
      if (changes['cId']) {
        const newUrl : string = "https://pokeapi.co/api/v2/pokemon/" + String(changes['cId'].currentValue) +"/"

        this.pokApi.addUrl(newUrl).subscribe({
          next: response => {
            this.p = response;
            console.log(response)
            //console.log(data.types)
         
      },
      error: err => console.error(err)
    })
  }
}
}


