import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],

})
export class AppComponent {
  title = 'app';
}
export class User {
id:number;
userName:string;
firstName:string;
lastName:string
email:string;
enable:boolean;
confirmation_token:string;
password:string;
}


