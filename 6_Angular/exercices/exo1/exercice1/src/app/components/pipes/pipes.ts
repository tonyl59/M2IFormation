import { DatePipe, DecimalPipe, LowerCasePipe, UpperCasePipe } from '@angular/common';
import { Component } from '@angular/core';
import { UppertablePipe } from '../../utils/uppertable-pipe';
import { OrderPipe } from '../../utils/order-pipe';

@Component({
  selector: 'app-pipes',
  imports: [UpperCasePipe, LowerCasePipe, DatePipe, DecimalPipe, UppertablePipe],
  templateUrl: './pipes.html',
  styleUrl: './pipes.css'
})

export class Pipes {
  message : string = "Hello world"
  messageMaj : string = "HELLO WORLD EN MAJUSCULE"
  pi : number = Math.PI
  today : Date = new Date()
  names: string[] = ["toto", "tata", "titi"]
}
