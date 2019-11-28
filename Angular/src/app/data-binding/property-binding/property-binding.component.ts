import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = 'John Kim';
  imgUrl = 'https://cdn.pixabay.com/photo/2016/05/17/22/16/baby-1399332__340.jpg';
  address = 'Gangnam street,Seoul,Korea-6958423';
  colorName = 'green';
  isActive = false;
  colSpanValue = 2;

  constructor() { }

  ngOnInit() {
  setInterval(() => {this.colorName = 'red';
                     this.isActive = !this.isActive;
  }, 2000); }
}
