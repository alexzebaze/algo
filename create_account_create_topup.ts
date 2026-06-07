// Angular 15.x code
import { Component, NgModule, Injectable, Inject, forwardRef } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

// Do not modify the service as validation tests will not pass
@Injectable({ providedIn: 'root' })
export class AccountingService {
    private accountsWithBalance: Map<string, number> = new Map();

    public async createAccount(accountID: string): Promise<void> {
        if (this.accountsWithBalance.has(accountID)) {
            throw Error("ACCOUNT_EXISTS");
        }
        this.accountsWithBalance.set(accountID, 0);
    }

    public async topUp(accountID: string, amount: number): Promise<number> {
        if (!this.accountsWithBalance.has(accountID)) {
            throw Error("ACCOUNT_DOES_NOT_EXIST");
        }
        this.accountsWithBalance.set(accountID, this.accountsWithBalance.get(accountID)! + amount);
        return this.accountsWithBalance.get(accountID)!;
    }
}

// Implement the component here
@Component({
    selector: 'account-component',
    template: `
        <input id="createAccountInput" #accountInputValue>
        <button id="createAccountButton" (click)="createAccount(accountInputValue.value)">+ Account</button>

        <input id="topupAccountInput" #topupAccountInputValue>
        <input id="topupAmountInput" type="number" #topupAmountInputValue>
        <button id="topupAccountButton" (click)="topUp(topupAccountInputValue.value, topupAmountInputValue.value)">+ depot</button>

        <div id="message">{{message}}</div>
    `
})
export class AccountComponent {
    message:any = "";

    constructor(public accountingService: AccountingService) { }

    async createAccount(accountID: string) {
        try {
            await this.accountingService.createAccount(accountID);
            this.message = "Successfully added account";
        } catch (error) {
            this.message = error;
        }
    }

    async topUp(accountID: string, amount: any) {
        if (Number(amount) <= 0) {
            this.message = "INVALID_INPUT";
        } else {
            try {
                await this.accountingService.topUp(accountID, Number(amount));
                this.message = "Current balance: " + amount;
            } catch (error) {
                this.message = error;
            }
        }
    }
}

// #region Preview
@Component({
  selector: 'app-parent',
    template: `<account-component></account-component>`
})
export class PreviewComponent { }
// #endregion Preview

// #region Module declaration - Do not Change
@NgModule({
    declarations: [PreviewComponent, AccountComponent],
    imports:[BrowserModule],
    bootstrap: [PreviewComponent]
})
export class AppModule { }
// #endregion Module declaration
