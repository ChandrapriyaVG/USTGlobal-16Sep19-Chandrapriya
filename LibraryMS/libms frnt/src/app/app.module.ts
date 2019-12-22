import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { HeaderComponent } from './header/header.component';
import { AddBookComponent } from './add-book/add-book.component';
import { AddLibrarianComponent } from './add-librarian/add-librarian.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { DisplayBookComponent } from './display-book/display-book.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { ViewRequestComponent } from './view-request/view-request.component';
import { IssuedBookComponent } from './issued-book/issued-book.component';
import { DeleteStudentComponent } from './delete-student/delete-student.component';
import { RequestStatusComponent } from './request-status/request-status.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
     AdminComponent,
    UserComponent,
    HeaderComponent,
    AddBookComponent,
    AddLibrarianComponent,
    AddStudentComponent,
    DisplayBookComponent,
    SearchBookComponent,
    ViewRequestComponent,
    IssuedBookComponent,
    DeleteStudentComponent,
    RequestStatusComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
