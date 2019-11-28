import { Component, OnInit, Input } from '@angular/core';

@Component({
  // tslint:disable-next-line: component-selector
  selector: 'app-bikechild',
  templateUrl: './bikechild.component.html',
  styleUrls: ['./bikechild.component.css']
})
export class BikechildComponent implements OnInit {
  @Input() bike: {imgURL: string, name: string};
  constructor() { }

  ngOnInit() {
  }

}
