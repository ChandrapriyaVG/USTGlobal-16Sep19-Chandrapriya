import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private service: AuthService, private http: HttpClient, private router: Router) { }

  addBook(addBookForm: NgForm) {
    this.http.post('http://localhost:8080/libms/library/librarian/createbook', addBookForm.value).subscribe(response => {
    if (response != null) {
      alert('Book Added');

      this.router.navigate(['/']);
    } else {
      alert('Failed to add book');
    }
    });
  }

  ngOnInit() {
  }

}
