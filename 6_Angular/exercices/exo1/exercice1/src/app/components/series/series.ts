import { Component } from '@angular/core';
import { OrderPipe } from '../../utils/order-pipe';

type Order = "asc" | "desc"
@Component({
  selector: 'app-series',
  imports: [OrderPipe],
  templateUrl: './series.html',
  styleUrl: './series.css'
})
export class Series {

  listTest : string[] = ["Hello","Bye Bye","See you","Good Morning"]
  order: Order = "desc"
  delete(index: number){
    this.listTest.splice(index,1) // "this.listTest.filter((_,i) => i != index" fonctionnerait aussi. C'est la même en opti mais filter est plus lisible (surtout qu'on peut confondre splice, slice etc
  }

  setOrder(order: Order) : void{
    this.order = order
  }
}