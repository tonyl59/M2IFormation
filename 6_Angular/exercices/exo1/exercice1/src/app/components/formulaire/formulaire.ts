import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

type User = {
  name : string
  email : string
  password : string
}

@Component({
  selector: 'app-formulaire',
  imports: [FormsModule],
  templateUrl: './formulaire.html',
  styleUrl: './formulaire.css'
})
export class Formulaire {
  message : string = ""
  message2 : string = ""
  isSubmitted : boolean = false

  user : User = {
    name: "",
    email: "",
    password: ""
  }

  updateMessage(event: Event) : void {
    let input = event.target as HTMLInputElement
    this.message = input.value
  }

  submitUser() : void {
    this.isSubmitted = true
    if (!this.passwordHasError){
      console.log(this.user);
    }
  }

  get passwordHasError() {
    return this.user.password.length < 6 && this.isSubmitted
  }
}
