import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-moviechild',
  templateUrl: './moviechild.component.html',
  styleUrls: ['./moviechild.component.css']
})
export class MoviechildComponent implements OnInit {
  @Input() movie: {imgURL: string, name: string};
  constructor() { }

  ngOnInit() {
  }

}
