import { Component, OnInit } from '@angular/core';
import { BookTransactionResponse } from '../booktransactionresponse';
import { RegistrationResponse } from '../registrationresponse';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-request',
  templateUrl: './view-request.component.html',
  styleUrls: ['./view-request.component.css']
})
export class ViewRequestComponent implements OnInit {

  requests: RegistrationResponse;
  acceptedRequest: BookTransactionResponse;
  constructor(private service: AuthService,
              private http: HttpClient,
              private router: Router) {
    this.getRequest();
  }
  getRequest() {
    this.http.get<RegistrationResponse>('http://localhost:8080/libms/library/librarian/viewRequest').subscribe(response => {
      if (response != null) {
        // alert('Book Requested!');
      }
      this.requests = response;
      console.log(this.requests);

    });
  }

  acceptRequest(request) {
    this.http.post<BookTransactionResponse>(`http://localhost:8080/libms/library/librarian/accept/${request.registrationId}`, request)
      .subscribe(response => {
        if (response != null) {
          alert('Request Accepted');

          this.getRequest();
          // this.acceptedRequest = response;
          this.router.navigate(['/issued-book']);
          console.log(this.acceptedRequest);
        } else {
          alert('Request rejected');
        }
      });
  }
  denyRequest(request) {
    this.http.delete(`http://localhost:8080/libms/library/librarian/reject/${request.registrationId}`)
      .subscribe(response => {
        if (response) {
          alert('Request denied');
          this.getRequest();
        }
      });
  }


  ngOnInit() {
  }

}
