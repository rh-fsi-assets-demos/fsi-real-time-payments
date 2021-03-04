import { Component, OnInit, ViewChild } from '@angular/core';
import { AccountInfoService } from '../_services/account-info.service';
import { BankingAccountInfo } from '../common/model/banking-account-info';
import { UserProfile } from '../common/model/user-profile';
import { UserDataService } from '../_services/user-data.service';
import { ObAccounts } from '../common/model/ob-accounts';
import { takeUntil } from 'rxjs/operators';
import { ObBalances } from '../common/model/ob-balances';
import { Observable, Subject } from 'rxjs';
import { MatAccordion } from '@angular/material/expansion';
import { ObAccount } from '../common/model/ob-account';
import { ObAccountsData } from '../common/model/ob-accounts-data';
import { ObBalance } from '../common/model/ob-balance';

@Component({
  selector: 'app-accounts-snapshot',
  templateUrl: './accounts-snapshot.component.html',
  styleUrls: ['./accounts-snapshot.component.scss']
})
export class AccountsSnapshotComponent implements OnInit {
  @ViewChild('accordion',{static:true}) Accordion: MatAccordion;
  destroy$: Subject<boolean> = new Subject<boolean>();
  panelOpenState = false;
  payAmount: number;
  // accountInfo: BankingAccountInfo[];
  accountInfo: ObAccountsData[];
  accounts: BankingAccountInfo[];
  obBalances: ObBalance[];
  selectedDebtAccount: ObAccounts;
  selectedBalance: ObBalance[];
  user: UserProfile | null;

  constructor(private accountInfoService: AccountInfoService, private userDataService: UserDataService) { }

  ngOnInit(): void {
    this.userDataService.getUser()
    .subscribe((user: UserProfile) => {
      this.user = user;
    });

    // this.accountInfoService.getAccountInfo()
    // .subscribe((account: BankingAccountInfo[]) => {
    //   this.accountInfo = account;
    //   this.accounts = this.accountInfo.filter(accountlist => ((accountlist.accountType !== 'Payee') && (accountlist.userId === this.user.id)));
    // });
    this.accountInfoService.getObAccounts(this.user.accountHolderId)
    .subscribe((account: ObAccounts) => {
      this.accountInfo = account.Data.Accounts;
      console.log(this.accountInfo);
      // this.accounts = this.accountInfo.filter(accountlist => ((accountlist.accountType !== 'Payee') && (accountlist.userId === this.user.id)));
    });

    // this.accountInfoService.getObBalances()
    // .pipe(takeUntil(this.destroy$))
    // .subscribe((res: ObBalances[]) => {
    //   console.log(res);
    //   this.obBalances = res;
    // });
  }

  beforePanelOpened(account){
    this.selectedBalance = this.obBalances.filter(balance => (balance.AccountId === account.AccountId));
  }

  accountSelected($event)  {
    this.selectedDebtAccount = $event.source.value;
    this.accountInfoService.getObBalances(this.selectedDebtAccount.Data.Accounts[0].AccountId)
      .pipe(takeUntil(this.destroy$))
      .subscribe((res) => {
        this.obBalances = res.Data.Balance;
        // this.udpateAccountData();
      });
  }

  calculateBalance() {}

}
