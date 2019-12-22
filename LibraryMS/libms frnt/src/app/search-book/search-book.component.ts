import { Component, OnInit } from '@angular/core';
import { BookResponse } from '../bookresponse';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})
export class SearchBookComponent implements OnInit {

  books: BookResponse;


  constructor(private http: HttpClient,
              private service: AuthService,
              private router: Router) { }

  searchBook(requestForm: NgForm) {
    this.http.post<BookResponse>('http://localhost:8080/libms/library/librarian/getBooks/', requestForm.value)
    .subscribe(response => {
      if (response != null) {
      this.books = response;
      console.log(this.books);
      // alert('Book fetched successfully');
      } else {
        alert('No books found with ' + requestForm.value.bookName + ' and ' + requestForm.value.author1);
      }
    });
  }

  requestBook(book) {
    this.http.get(`http://localhost:8080/libms/library/student/book/request/${book.bookId}`)
    .subscribe(response => {
      if (response != null) {
        alert('Requested Successfully!');
      }
    });
  }
  ngOnInit() {
  }

}

