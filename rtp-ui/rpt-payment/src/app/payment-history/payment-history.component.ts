import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { PAYMENTDATA } from '../../assets/data/payment-data';
import { PaymentHistory } from '../common/model/payment-history';
import { BankingAccountInfo } from '../common/model/banking-account-info';
import { AccountInfoService } from '../_services/account-info.service';
import { UserDataService } from '../_services/user-data.service';
import { UserProfile } from '../common/model/user-profile';

@Component({
  selector: 'app-payment-history',
  templateUrl: './payment-history.component.html',
  styleUrls: ['./payment-history.component.scss']
})
export class PaymentHistoryComponent implements OnInit {
  displayedColumns: string[] = ['payee', 'amount', 'date', 'tags'];
  searchText: string;
  dataSource = new MatTableDataSource<PaymentHistory>();
  accountInfo: BankingAccountInfo[];
  accounts: BankingAccountInfo[];
  selectedAccount: BankingAccountInfo;
  user: UserProfile | null;

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;

  constructor(private accountInfoService: AccountInfoService, private userDataService: UserDataService){}

  ngOnInit() {
    this.dataSource.paginator = this.paginator;

    this.userDataService.getUser()
    .subscribe((user: UserProfile) => {
      this.user = user;
    });

    this.accountInfoService.getAccountInfo()
    .subscribe((account: BankingAccountInfo[]) => {
      this.accountInfo = account;
      this.accounts = this.accountInfo.filter(accountList => ((accountList.accountType !== 'Payee') && (accountList.userId === this.user.id)));
    });
    // this.accounts = this.accountInfo.filter(accountList => ((accountList.accountType !== 'Payee') && (accountList.userId === this.user.id)));
  }

  public applyFilter() {
    this.dataSource.filter = this.searchText.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }

  accountSelected($event: any) {
    this.dataSource = new MatTableDataSource<PaymentHistory>(PAYMENTDATA);
    this.dataSource.filter = $event.source.value.accountNum.trim().toLowerCase();
    this.dataSource.paginator = this.paginator;
  }
}
