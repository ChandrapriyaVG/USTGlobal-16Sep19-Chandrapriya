import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      imgURL : 'https://cdn.pixabay.com/photo/2016/11/22/23/44/buildings-1851246__340.jpg',
      name : 'Porsche',
    },
    {
      imgURL : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      name : 'BMW',
    },
    {
      imgURL : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      name : 'Audi',
    },
    {
      imgURL : 'https://cdn.pixabay.com/photo/2013/07/12/12/56/ford-mustang-146580__340.png',
      name : 'Ford Mustang',
    }
];

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }
}
