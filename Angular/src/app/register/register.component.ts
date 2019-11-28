import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { UserService } from '../user.service';




@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy{

  users: any[];
  selectedUser;
  today = new Date();

  constructor(public service: UserService) {
    console.log('constructor is exectued');
    this.getData();
   }

  ngOnInit() {
    console.log('ngOnIt is executed');
  }

  ngDoCheck() {
    console.log('ngdocheck is executed');
  }

  ngAfterViewInit() {
    console.log('afterViewInIt is executed');
  }

ngAfterViewChecked() {
  console.log('ng view checked executed');
}

ngOnDestroy() {
  console.log('ngOnDestroy executed');
}

  loginData(form) {
    console.log(form.value);
    this.service.postUser(form.value). subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data hosted successfully');
    });
  }

getData() {
  this.service.getUser().subscribe(data => {
    console.log(data);
    this.users = data;
  }, err => {
    console.log(err);
  }, () => {
    console.log('data got successfully');
  });
}
deleteData(user) {
  console.log(user);
  this.service.deleteUser(user.id).subscribe(data => {
    console.log(data);
    this.getData();
  }, err => {
    console.log(err);
  }, () => {
    console.log('data deleted successfully');
  });

}
selectUser(user) {
  console.log(user);
  this.selectedUser = user;

}
updateData(form) {
  console.log(form.value);
  this.service.updateUser(form.value.id, form.value).subscribe(data => {
    console.log(data);
  }, err => {
    console.log(err);
  }, () => {
    console.log('data updated successfully');
  } );
}
}
