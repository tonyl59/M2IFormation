import { Component } from '@angular/core';
import { Enfant } from '../enfant/enfant';

interface User {
  nom : string,
  age : number
}

@Component({
  selector: 'app-parent',
  imports: [Enfant],
  templateUrl: './parent.html',
  styleUrl: './parent.css'
})
export class Parent {
  parentMessage : string = "Hello depuis le composant parent !"

  user1 : User = {
    nom: "toto",
    age: 30
  }
  user2 : User = {
    nom: "tata",
    age: 30
  }
  user3 : User = {
    nom: "titi",
    age: 30
  }

  listUser: User[] = [
    {
      nom: "toto",
      age: 30
    },
    {
      nom: "tata",
      age: 30
    },
    {
      nom: "titi",
      age: 30
    }
  ]

  receiveData : string = ""

  handleData(data : string) : void {
    this.receiveData = data
  }
}
