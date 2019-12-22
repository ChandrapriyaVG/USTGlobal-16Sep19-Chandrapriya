import { Component, OnInit } from '@angular/core';
import { BookTransactionResponse } from '../booktransactionresponse';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-request-status',
  templateUrl: './request-status.component.html',
  styleUrls: ['./request-status.component.css']
})
export class RequestStatusComponent implements OnInit {

  transactions: BookTransactionResponse;
 constructor(private service: AuthService,
             private http: HttpClient) {
  }

  id = null;

  ngOnInit() {
  }

  getRequestStatusInfo(requestStatus: NgForm) {
    this.http.get<BookTransactionResponse>(`http://localhost:8080/libms/library/student/requestStatus/${requestStatus.value.id}`)
      .subscribe(response => {
        if (response != null) {
          alert('Request Accepted Succefully');
        } else {
          alert('Request denyed for ID ' + requestStatus.value.id);
        }
        this.transactions = response;
        console.log(response);
      });
  }

}
