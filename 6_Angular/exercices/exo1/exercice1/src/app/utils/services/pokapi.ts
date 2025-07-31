import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pokemon } from '../types/pokemon.type';

@Injectable({
  providedIn: 'root'
})
export class Pokapi {
  
  private baseUrl = "https://pokeapi.co/api/v2/pokemon"

  constructor(private http: HttpClient){}

  getPosts(): Observable<Pokemon[]>{
    return this.http.get<Pokemon[]>(this.baseUrl+"?limit=150")
  }


  addUrl(newUrl : string) : Observable<Pokemon>{
    console.log(newUrl)
    return this.http.get<Pokemon>(newUrl)
  }

  
}
