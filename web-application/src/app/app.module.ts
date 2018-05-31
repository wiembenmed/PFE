import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HttpModule} from '@angular/http';
import {FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { ListuserComponent } from './components/listuser/listuser.component';
import { UserFormComponent } from './components/user-form/user-form.component';
import {UserService} from './shared-service/user.service';
import { LoginFormComponent } from './components/login-form/login-form.component';



const appRoutes : Routes=[
{path:'', component:ListuserComponent},
{path:'op',component:UserFormComponent},


{path:'op', component:LoginFormComponent},

];

@NgModule({
  declarations: [
    AppComponent,
    ListuserComponent,
    UserFormComponent,
    LoginFormComponent,




  ],
  imports: [
    BrowserModule,
    HttpModule,
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  providers: [UserService ],


  bootstrap: [AppComponent],
})
export class AppModule { }
