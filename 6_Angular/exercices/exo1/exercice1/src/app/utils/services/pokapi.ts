import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Pokemon } from '../types/pokemon.type';

@Injectable({
  providedIn: 'root'
})
export class Pokapi {
  
  private baseUrl = "https://pokeapi.co/api/v2/pokemon"

  constructor(private http: HttpClient){}
/*
  getPosts(): Observable<Pokemon[]>{
    return this.http.get<Pokemon[]>(this.baseUrl)
  }
*/

  addUrl(newUrl : string) : Observable<Pokemon>{
    //console.log(newUrl)
    return this.http.get<any>(newUrl).pipe(
      map((data) =>({
        pkmnId: data.id,
        name: data.forms[0].name,
        height: data.height,
        weight: data.weight,
        image: data.sprites.front_default,
        types: [data.types[0].type.name],
        moves: data.moves
      }))
    );
  }
}
