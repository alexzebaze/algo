
@Component({
	 selector:'counter-component',
	 template: `
	 <input id="intervalInput" type="number" #intervalInputValue/>
	 <button id="intervalSetButton" (click)="pup(intervalInputValue.value)">Set interval</button>`
 })
 export class CounterComponent {
	 @Input() message;
	 @Output() tick=new EventEmitter<any>();
	 subscription:Subscription;
	 pup(value){
		 if(this.subscription!=undefined){
			 this.subscription.unsubscribe();
		 }
		 let src=interval(Number(value));
			 this.subscription=src.subscribe(obj=>{
			 this.tick.emit(this.message);
		 })
	 }
 }
