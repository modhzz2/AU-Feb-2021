import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular1';
  logs : Array<any> = [];
  text: string;

  constructor(){
    this.text="";
  }
  ngOnInit(): void{

  }
  textUpdate(event : any)
  {
    this.text=event.target.value;
    this.logs.push({key_up_at : new Date() ,text : this.text});
  }
}
