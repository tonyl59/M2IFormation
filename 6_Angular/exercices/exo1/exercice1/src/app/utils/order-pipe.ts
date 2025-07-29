import { Pipe, PipeTransform } from '@angular/core';

type Order = "asc" | "desc"

@Pipe({
  name: 'order',
  standalone: true
})
export class OrderPipe implements PipeTransform {

  transform(value: string[], order: Order): string[] {
    /*if (order = "asc"){
      return list.sort((a,b) =>  (a > b ? 1 : -1))
    }
    else{
      return list.sort((a,b) => (a > b ? -1 : 1)) } */

  return order === "asc" ? [...value].sort() : [...value].sort().reverse()
    }
  }
