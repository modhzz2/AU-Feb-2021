import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateSessionComponent } from './create-session/create-session.component';
import { AllSessionsComponent } from './allsessions/allsessions.component';
import { SessionComponent } from './session/session.component';
import { EditSessionComponent } from './edit-session/edit-session.component';
import {SessionService} from './sessions.service';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import {MatCardModule} from '@angular/material/card';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
const appRoutes : Routes = [
  {path: '', component: CreateSessionComponent},
  {path: 'sessions', component: AllSessionsComponent, children: [
    {path: ':id', component: SessionComponent},
    {path: ':id/edit', component:EditSessionComponent}
  ]}
];


@NgModule({
  declarations: [
    AppComponent,
    CreateSessionComponent,
    AllSessionsComponent,
    SessionComponent,
    EditSessionComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    FormsModule,
    MatCardModule,
    BrowserAnimationsModule
  ],
  providers: [SessionService],
  bootstrap: [AppComponent]
})
export class AppModule { }
