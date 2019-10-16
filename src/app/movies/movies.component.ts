import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MOVIESComponent {

  movies: any [] = [];
  constructor(private http: HttpClient) {
  }
 ngOnInIt(){
 }
 searchMovies(movie){
   this.http.get<any>(`http://www.omdbapi.com/?apikey=67612129&=${movie}`).subscribe(data => {
    this.movies = data.Search;
    console.log(this.movies);
   })

 }
 }


