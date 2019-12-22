import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { BookResponse } from '../bookresponse';

@Component({
  selector: 'app-display-book',
  templateUrl: './display-book.component.html',
  styleUrls: ['./display-book.component.css']
})
export class DisplayBookComponent implements OnInit {
  books: BookResponse;
   constructor(private service: AuthService,
               private http: HttpClient) {
      this.getData();
    }

    ngOnInit() {
    }
    getData() {
      this.http.get<BookResponse>('http://localhost:8080/libms/library/librarian/getBooks').subscribe(response => {
        this.books = response;
        console.log(this.books);
      });
    }

    deleteLibrarian(books) {
      this.http.delete(`http://localhost:8080/libms/library/librarian/${books.bookid}`).subscribe(resData => {
        if (resData) {
          // alert('Book Deleted Successfully');
          console.log(resData);
          this.getData();
        } else {
          alert('Failed to Delete Book');
        }
        console.log(resData);
        this.getData();
      }, err => {
        console.log(err);
      });
    }

  }
