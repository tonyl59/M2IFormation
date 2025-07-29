import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'uppertable',
  standalone: true
})
export class UppertablePipe implements PipeTransform {

  transform(value: string[]): string[] {
    return value.map((element) => element.toUpperCase()); // Le map permet de faire une action... chaque elements de la liste value je les appelle "element" et ils sont transformés en uppercase
  }

}
