import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { PaymentConfirmation } from '../common/model/payment-confirmation';
import { BankingAccountInfo } from '../common/model/banking-account-info';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  templateUrl: './maintain-account-dialog.component.html',
  styleUrls: ['./maintain-account-dialog.component.scss']
})
export class MaintainAccountDialogComponent implements OnInit {
  paymentConfirmation: PaymentConfirmation[];
  searchText: string;
  debitAccountFormGroup: FormGroup;
  isEdit = false;

  constructor(private formBuilder: FormBuilder, public dialogRef: MatDialogRef<MaintainAccountDialogComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  ngOnInit(): void {
    if (this.data.selectedDebtAccount !== null && this.data.selectedDebtAccount !== undefined){
      this.isEdit = true;

      this.debitAccountFormGroup = this.formBuilder.group({
        name: [this.data.selectedDebtAccount.name, Validators.required],
        routingNum: [this.data.selectedDebtAccount.routingNum, Validators.required],
        accountNum: [this.data.selectedDebtAccount.accountNum, Validators.required]
      });
    } else {
      this.isEdit = false;
      this.debitAccountFormGroup = this.formBuilder.group({
        name: ['', Validators.required],
        routingNum: [, Validators.required],
        accountNum: [, Validators.required]
      });
    }
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  onSubmit() {}

  public applyFilter() {
    console.log('search');
  }
}
