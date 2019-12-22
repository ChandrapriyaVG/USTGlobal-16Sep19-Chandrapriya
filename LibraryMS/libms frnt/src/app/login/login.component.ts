import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { LoginResponse } from '../loginresponse';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {



  constructor(private service: AuthService, private router: Router, private http: HttpClient) { }

  login(loginForm: NgForm) {

    console.log(loginForm);
    this.http.post<LoginResponse>('http://localhost:8080/libms/library/login/', loginForm).subscribe(response => {
      if (response != null && response.type === 'Admin') {
        // window.confirm(' Welcome  ' + response.name);
        this.router.navigate(['/add-librarian']);
        this.service.isALoggedIn = true;
      } else if (response != null && response.type === 'Librarian') {
        // window.confirm(' Welcome  ' + response.name);
        this.router.navigate(['/']);
        this.service.isLLoggedIn = true;
      } else if (response != null && response.type === 'Student') {
        // window.confirm(' Welcome  ' + response.name);
        this.router.navigate(['/']);
        this.service.isSLoggedIn = true;
      } else {
        window.confirm('Login Failed');
      }
    });
  }

  ngOnInit() {
  }

}
