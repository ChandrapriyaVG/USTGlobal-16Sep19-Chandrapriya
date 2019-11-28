import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { BikesComponent } from './bikes/bikes.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { RouterModule } from '@angular/router';
import { CarchildComponent } from './cars/carchild/carchild.component';
import { BikechildComponent } from './bikes/bikechild/bikechild.component';
import { MoviesComponent } from './movies/movies.component';
import { MoviechildComponent } from './movies/moviechild/moviechild.component';
import { LaptopchildComponent } from './laptops/laptopchild/laptopchild.component';
import { MobilechildComponent } from './mobiles/mobilechild/mobilechild.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarsComponent,
    BikesComponent,
    LaptopsComponent,
    MobilesComponent,
    CarchildComponent,
    BikechildComponent,
    MoviesComponent,
    MoviechildComponent,
    LaptopchildComponent,
    MobilechildComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'cars', component : CarsComponent},
      {path : 'bikes', component : BikesComponent},
      {path : 'movies', component : MoviesComponent},
      {path : 'laptops', component : LaptopsComponent},
      {path : 'mobiles', component : MobilesComponent}
    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
