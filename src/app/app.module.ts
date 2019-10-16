import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { MOVIESComponent } from './movies/movies.component';
import { AddMoviesComponent } from './add-movies/add-movies.component';
import { LoginComponent } from './login/login.component';
import { from } from 'rxjs';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MOVIESComponent,
    AddMoviesComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(
      [
        {path : 'movies', component : MOVIESComponent},
        {path : 'addmovie', component : AddMoviesComponent},
        {path : 'login', component : LoginComponent}
      ])
    ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
