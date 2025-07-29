import { Component } from '@angular/core';
import { EmojiManagerPipe } from '../../utils/emoji-manager-pipe';

  interface Book {
    title: string,
    author: string
    isRead: boolean,
}
@Component({
  selector: 'app-library',
  imports: [EmojiManagerPipe],
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
    title: "A title number two",
    author: "author3",
    isRead: false
  }

]
  book4 : Book = {
    title: "A title number one",
    author: "author4",
    isRead: false
  }
  
  addBook(book: Book): void{
  this.books.push(book)
}

 toggleRead(book: Book): void{
  book.isRead = !book.isRead
  }
}