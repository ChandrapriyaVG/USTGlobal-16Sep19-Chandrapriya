import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})

export class HomeComponent {
    news;
    constructor(private http: HttpClient) {
        this.getNews();
    }
    getNews() {
        this.http.get<any>(`
        https://newsapi.org/v2/top-headlines?country=us&apiKey=11fb84e782a745b9a86fd1cb66a4f880`).subscribe(data => {
        this.news = data.articles;
        // console.log(data);
          }, err => {
            console.log(err);
          }, () => {
            console.log('news updated successfully');
          } );
        }
    }

