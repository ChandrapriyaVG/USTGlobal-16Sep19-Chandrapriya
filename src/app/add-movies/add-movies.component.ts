import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { CustomValidation } from './custom.validation';

@Component({
  selector: 'app-add-movies',
  templateUrl: './add-movies.component.html',
  styleUrls: ['./add-movies.component.css']
})
export class AddMoviesComponent implements OnInit {
  get title() {
    return this.form.get('email');
  }


  form = new FormGroup({
    title : new FormControl('', [Validators.required, CustomValidation.unique]),

  });
  constructor() { }

  ngOnInit() {
  }
  loginData(form) {
    console.log(form);
  }

}





