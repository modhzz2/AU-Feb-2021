import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SessionService } from '../sessions.service';

@Component({
  selector: 'app-sessions',
  templateUrl: './allsessions.component.html',
  styleUrls: ['./allsessions.component.css']
})
export class AllSessionsComponent implements OnInit {

  allSessions:{sessionName:string,description:string,instructorName:string}[] = [];
  constructor(private sessionService:SessionService,
    private router: Router) { }

  ngOnInit(): void {
    this.allSessions = this.sessionService.allSessions;
  }

}
