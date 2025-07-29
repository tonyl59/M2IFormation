import { Pipe, PipeTransform } from '@angular/core';


@Pipe({
  name: 'emojiManager'
})
export class EmojiManagerPipe implements PipeTransform {

  transform(value: boolean): string {
    if (value){
      return "👍"
    } return "👎"
  }

}
