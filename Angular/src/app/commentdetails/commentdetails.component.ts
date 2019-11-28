import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-commentdetails',
  templateUrl: './commentdetails.component.html',
  styleUrls: ['./commentdetails.component.css']
})
export class CommentdetailsComponent implements OnInit {
  Comments: any[] = [];
  constructor() { }

  ngOnInit() {
  }
  getAllComments(childData) {
    console.log('childData', childData );
    this.Comments.push(childData);
  }

}
