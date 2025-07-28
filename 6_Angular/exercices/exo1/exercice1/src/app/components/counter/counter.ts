import { Component } from '@angular/core';

@Component({
  selector: 'app-counter',
  imports: [],
  templateUrl: './counter.html',
  styleUrl: './counter.css'
})
export class Counter {
  count : number = 0 // valeur initial
  isPair: boolean = false // Va permettre, en conjonction avec increment/decrement, de faire un check pour changer la couleur du comptage dans le html

  increment() : void{ // pour incrementer le compteur
    this.count += 1
    if (this.count%2 == 0){ // si nombre compteur est pair...
      this.isPair = true
    }
    else{ // si nombre du compteur est impair...
      this.isPair = false
    }
  }
  decrement() : void{ // pour décrementer le compteur
    if (this.count !=0){ // Permet d'indirectement mettre la limite minimum du compteur à 0 pour éviter qu'il soit au négatif
      this.count -= 1
    }

        if (this.count%2 == 0){ // si nombre compteur est pair...
      this.isPair = true
    }
    else{ // si nombre du compteur est impair...
      this.isPair = false
    }


    
  }
  
}





