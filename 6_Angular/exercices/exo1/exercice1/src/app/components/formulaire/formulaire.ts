import { Component } from '@angular/core';
import { FormArray, FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';


type User = {
  name : string
  email : string
  password : string
}

@Component({
  selector: 'app-formulaire',
  imports: [FormsModule, ReactiveFormsModule],
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

  // Reactive forms

  // FormControl
  book_control : FormControl = new FormControl("", [
    Validators.required,
    Validators.minLength(2),
  ])

  saveBook(): void {
    if (this.book_control.valid) {
      console.log("Livre :", this.book_control.value);
    }
  }

  // FormGroup

  formation_form : FormGroup = new FormGroup(
    {
      title: new FormControl("", [Validators.required]),
      duration : new FormControl(0, [Validators.required]),
      trainer : new FormGroup({
        firstname : new FormControl("", [Validators.required]),
        lastname: new FormControl("", [Validators.required])
      }),
      modules : new FormArray([new FormControl(""), new FormControl("")])
    }, [Validators.required]
  )

  saveFormation() : void {
    if (this.formation_form.valid) {
      console.log("Formation : ", this.formation_form.value);
      this.formation_form.reset()
    }
  }

  get modules() {
    return this.formation_form.controls["modules"] as FormArray
  }

  addModule() : void {
    this.modules.push(new FormControl(""))
  }
}
