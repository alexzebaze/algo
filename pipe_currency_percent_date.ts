
import { Component, Input, NgModule } from '@angular/core';
 import {CommonModule} from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';


 @Component({
  selector:'app-parent',
  template: `<transaction-component [fee]=0.02 [amount]=123.45 [currency]="'EUR'"
[timeOfTransaction]='getPresetDate()'></transaction-component>`
  })
   export class PreviewComponent {
   public getPresetDate(){
   return new Date(1997,6,1,12,32);
   }
}

    @Component({
     selector:'transaction-component',
     template: `
     <div id="fee">{{fee | percent : '2.2-3'}}</div>
     <div id="amount">{{amount | currency : currency : 'symbol' : '9.2-2'}}</div>
     <div id="time">{{timeOfTransaction | date : 'ww: yyyy MMMMM dd hh-mm-ss'}}</div>
     `
     })
     export class TransactionDetailsComponent {
    
     @Input()
     public currency: string = '';
    
     @Input()
     public timeOfTransaction: Date = new Date();
    
     @Input()
     public amount: number=0;
    
     @Input()
     public fee: number = 0;

  }

@NgModule({
  declarations: [
    PreviewComponent,
    TransactionDetailsComponent
  ],
  imports: [
    BrowserModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [PreviewComponent]
})
export class AppModule { }
