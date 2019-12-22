import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AddBookComponent } from './add-book/add-book.component';
import { AddLibrarianComponent } from './add-librarian/add-librarian.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { DisplayBookComponent } from './display-book/display-book.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { ViewRequestComponent } from './view-request/view-request.component';
import { DeleteStudentComponent } from './delete-student/delete-student.component';
import { IssuedBookComponent } from './issued-book/issued-book.component';
import { RequestStatusComponent } from './request-status/request-status.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'user', component: UserComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },
  {path: 'add-book', component: AddBookComponent},
  {path: 'add-librarian', component: AddLibrarianComponent},
  {path: 'add-student', component: AddStudentComponent},
  {path: 'display-book', component: DisplayBookComponent},
  {path: 'search-book', component: SearchBookComponent},
  {path: 'view-request', component: ViewRequestComponent},
  {path: 'delete-student', component: DeleteStudentComponent},
  {path: 'issued-book', component: IssuedBookComponent},
  {path: 'request-status', component: RequestStatusComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
