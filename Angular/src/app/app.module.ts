import { BrowserModule } from '@angular/platform-browser';
import { NgModule, RootRenderer } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeadercComponent } from './Header/header.component';
import { HomeComponent } from './Home/home.component';
import { AboutComponent } from './About/about.component';
import { RouterModule } from '@angular/router';
import { HelpComponent } from './Help/help.component';
import { FooterComponent } from './footer/footer.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { NgIfComponent } from './directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentdetailsComponent } from './commentdetails/commentdetails.component';
import { DollarPipe } from './dollar.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeadercComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    FooterComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentdetailsComponent,
    DollarPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
    {path : '', component : HomeComponent},
    {path : 'about', component : AboutComponent},
    {path : 'help', component : HelpComponent},
    {path : 'property-binding', component : PropertyBindingComponent},
    {path : 'event-binding', component : EventBindingComponent},
    {path : 'two-way-binding', component : TwoWayBindingComponent},
    {path : 'ngIf', component : NgIfComponent},
    {path : 'ngFor', component : NgForComponent},
    {path : 'ngSwitch', component : NgSwitchComponent},
    {path : 'register', component : RegisterComponent},
    {path : 'form1', component : Form1Component},
    {path : 'form2', component : Form2Component},
    {path : 'form3', component : Form3Component},
    {path : 'form4', component : Form4Component},
    {path : 'reactive', component : ReactiveFormComponent},
    {path : 'parent', component : ParentComponent},
    {path : 'commentdetails', component : CommentdetailsComponent}])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
