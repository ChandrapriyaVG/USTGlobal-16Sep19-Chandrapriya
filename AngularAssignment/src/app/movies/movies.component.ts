import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  selectedMovie;

  Movies = [
    {
      imgURL : 'https://cdn.pixabay.com/photo/2018/04/18/15/02/chaplin-3330639__340.png',
      name : 'Charlie Chaplin',
      rating :  'Ratings:10/10',
      // tslint:disable-next-line: max-line-length
      details : 'Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film. He became a worldwide icon through his screen persona, "The Tramp", and is considered one of the most important figures in the history of the film industry.',
    },
    {
      imgURL : 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
      name : 'Spiderman',
      rating : 'Ratings:10/10' ,
      // tslint:disable-next-line: max-line-length
      details : 'Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books.',
    },
    {
      imgURL : 'https://image.shutterstock.com/image-photo/young-woman-image-germanicscandinavian-god-260nw-1034427742.jpg',
      name : 'Thor',
      rating : 'Ratings:10/10',
      // tslint:disable-next-line: max-line-length
      details : 'Thor is exiled by his father, Odin, the King of Asgard, to the Earth to live among mortals. When he lands on Earth, his trusted weapon Mjolnir is discovered and captured by S.H.I.E.L.D.',
    },
    {
      imgURL : 'https://cdn.pixabay.com/photo/2017/07/14/12/58/superhero-2503808__340.jpg',
      name : 'Superman',
      rating : 'Ratings:10/10',
      // tslint:disable-next-line: max-line-length
      details : 'Superman is a fictional superhero. The character was created by writer Jerry Siegel and artist Joe Shuster, and first appeared in Action Comics #1, a comic book published on April 18, 1938.',
    },
    {
      imgURL : 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
      name : 'Avengers',
      rating : 'Ratings:10/10'  ,
      // tslint:disable-next-line: max-line-length
      details : 'Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown.',
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendMovie(movie) {
    console.log(movie);
    this.selectedMovie = movie;
  }
}
