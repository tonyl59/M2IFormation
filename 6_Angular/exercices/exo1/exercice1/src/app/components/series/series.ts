import { Component } from '@angular/core';

@Component({
  selector: 'app-series',
  imports: [],
  templateUrl: './series.html',
  styleUrl: './series.css'
})
export class Series {

  isLogged : boolean = false;

  listTest : string[] = ["Hello","Bye Bye","See you","Good Morning"]

  delete(index: number){
    this.listTest.splice(index,1)
  }

}