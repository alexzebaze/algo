import { Component, Input, NgModule, Output, EventEmitter } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

@Component({
    selector: 'display-component',
    template: `
        <div id="lastVote">{{answer}}</div>
        <voter-component [question]="question" [yesAnswer]="yesAnswer" [noAnswer]="noAnswer"
        (output)="result($event)"></voter-component>
    `
})
export class DisplayComponent {
    public question = "Too easy?";
    public yesAnswer = "Yes";
    public noAnswer = "No";
    public answer = "";

    result(event:boolean) {
      this.answer = event ? this.yesAnswer : this.noAnswer;
    }
}

// VoterComponent: do not change
@Component({
    selector: 'voter-component',
    template: `
        <p>{{question}}</p>
        <button (click)="vote(true)">{{yesAnswer}}</button>
        <button (click)="vote(false)">{{noAnswer}}</button>
    `
})
export class VoterComponent {
    @Input()
    public question: string|undefined;

    @Input()
    public yesAnswer: string|undefined;

    @Input()
    public noAnswer: string|undefined;

    @Output()
    public output = new EventEmitter<boolean>();

    public vote(value: boolean): void {
        this.output.emit(value);
    }
}

// #region Preview
@Component({
    selector: 'app-parent',
    template: `<display-component></display-component>`
})
export class PreviewComponent { }
// #endregion Preview

// #region Module declaration - Do not Change
@NgModule({
    declarations: [PreviewComponent, DisplayComponent, VoterComponent],
    imports: [BrowserModule],
    bootstrap: [PreviewComponent]
})
export class AppModule { }
// #endregion Module declaration
