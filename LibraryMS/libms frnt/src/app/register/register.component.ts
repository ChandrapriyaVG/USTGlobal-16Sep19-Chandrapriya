import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  error: any;



  constructor(private auth: AuthService, private http: HttpClient) { }

  register(registerForm: NgForm) {
    console.log(registerForm.value);
    this.auth.registerUser(registerForm.value)
      .subscribe(res => {
        console.log(res);
        if (res != null) {
          alert(`Registered Successfully! Your ID is ${res.id}`);
        }
        registerForm.reset();
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });
  }


  ngOnInit() {
  }

}

