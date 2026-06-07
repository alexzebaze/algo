

import { Component, Input, Output, EventEmitter } from '@angular/core';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-parent',
  template: `<h2>Parent container</h2><h3>From child: {{message}}</h3>
  <app-child [msg]="message" (event)="getText($event)"></app-child>`,
})
export class ParentComponent {
  message : string = '';
  getText(newText:string){
    this.message = newText;
  }
}

@Component({
  selector: 'app-child',
  template: `<hr><h2>Child container</h2>
      <h3>Child compoment</h3>
      <input type="text" placeholder="enter message" [(ngModel)]="msg"> 
      <button type="button" (click)="valid()">Send to parent</button>`,
})
export class ChildComponent {
  @Input() msg = "";
  @Output() event = new EventEmitter<string>();

  valid(){
    this.event.emit(this.msg);
  }
}

@NgModule({
  declarations: [
    ParentComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [ParentComponent]
})
export class AppModule { }
