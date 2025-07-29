import { Component } from '@angular/core';
import { EmojiManagerPipe } from '../../utils/emoji-manager-pipe';
import { FormsModule } from '@angular/forms';

  interface Book {
    title: string,
    author: string
    isRead: boolean,
}
@Component({
  selector: 'app-library',
  imports: [EmojiManagerPipe, FormsModule],
  templateUrl: './library.html',
  styleUrl: './library.css'
})

export class Library {
  books : Book[] = [{
    title: "A title number one",
    author: "author1",
    isRead: false
  },

  {
    title: "A title number two",
    author: "author2",
    isRead: false
  },

  {
    title: "A title number three",
    author: "author3",
    isRead: false
  }

]

  toggleRead(book : Book): void{
    book.isRead = !book.isRead
  }
  book4 : Book = {
    title: "A title number one",
    author: "author4",
    isRead: false
  }

  // Setup form to add book

    isSubmitted : boolean = false

    bookAdd : Book = {
    title: "",
    author: "",
    isRead: false
  }

  submitBook(): void{
   
    this.isSubmitted = true
    this.books.push(this.bookAdd)

    this.bookAdd = {
    title: "",
    author: "",
    isRead: false
  }
    
  

  }

  /*
  submitBook(titleAdd : string, authorAdd : string) : void {
    const book = {
    title: titleAdd,
    author: authorAdd,
    isRead: false

    }
    this.isSubmitted = true
    this.books.push(book)

  }
    */

  
}

