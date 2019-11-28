import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
Product = [
  { img : 'https://cdn.pixabay.com/photo/2016/07/27/20/03/berries-1546125__340.jpg',
    name : 'BERRIES',
    price : 500,
 },
  { img : 'https://cdn.pixabay.com/photo/2016/10/07/13/36/tangerines-1721590__340.jpg',
  name : 'ORANGE',
  price : 250,
  },
  { img : 'https://cdn.pixabay.com/photo/2018/05/08/20/19/pomegranate-3383814__340.jpg',
  name : 'POMEGRANATE',
  price : 100,
  }
];
  constructor() { }

  ngOnInit() {
  }

}
