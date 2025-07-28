import { Component } from '@angular/core';

@Component({
  selector: 'app-counter',
  imports: [],
  templateUrl: './counter.html',
  styleUrl: './counter.css'
})
export class Counter {
  count : number = 0
  isPair: boolean = false

  increment() : void{
    this.count += 1
    if (this.count%2 == 0){
      this.isPair = true
    }
    else{
      this.isPair = false
    }
  }

  decrement() : void{
    if (this.count !=0){
      this.count -= 1
    }
    
  }
}





