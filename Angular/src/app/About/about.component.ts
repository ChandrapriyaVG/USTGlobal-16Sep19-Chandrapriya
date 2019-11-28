import { Component, OnInit } from '@angular/core';

@Component ({
    selector : 'app-about',
    templateUrl : './about.component.html',
    styleUrls : ['./about.component.css']
})

export class AboutComponent implements OnInit {
 constructor() {}
imageUrl = 'https://cdn.pixabay.com/photo/2016/01/19/17/25/young-girl-1149701__340.jpg';
    ngOnInit() {}
}
