import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { PaymentConfirmation } from '../common/model/payment-confirmation';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AccountInfoService } from '../_services/account-info.service';
import { BankingAccountInfo } from '../common/model/banking-account-info';


@Component({
  templateUrl: './maintain-payee-dialog.component.html',
  styleUrls: ['./maintain-payee-dialog.component.scss']
})
export class MaintainPayeeDialogComponent implements OnInit {
  paymentConfirmation: PaymentConfirmation[];
  searchText: string;
  payeeAccountFormGroup: FormGroup;
  isEdit = false;
  formAction: string;

  constructor(private formBuilder: FormBuilder, private accountInfoService: AccountInfoService,
              public dialogRef: MatDialogRef<MaintainPayeeDialogComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  ngOnInit(): void {
    console.log(this.data.selectedPayee);
    if (this.data.selectedPayee !== null && this.data.selectedPayee !== undefined) {
      this.isEdit = true;

      this.payeeAccountFormGroup = this.formBuilder.group({
        name: [this.data.selectedPayee.name, Validators.required],
        routingNum: [this.data.selectedPayee.routingNum, Validators.required],
        accountNum: [this.data.selectedPayee.accountNum, Validators.required]
      });
    } else {
      this.isEdit = false;

      this.payeeAccountFormGroup = this.formBuilder.group({
        name: ['', Validators.required],
        routingNum: [, Validators.required],
        accountNum: [, Validators.required]
      });
    }
  }

  setAction(value: string): void {
    this.formAction = value;
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  onSubmit(): void {
    if (this.formAction === 'Add'){
      this.accountInfoService.addAccountInfo(new BankingAccountInfo(this.payeeAccountFormGroup.controls['name'].value,
            this.payeeAccountFormGroup.controls['routingNum'].value, this.payeeAccountFormGroup.controls['accountNum'].value,
            'Payee'))
        .subscribe();
    } else if (this.formAction === 'Delete'){
      console.log('Delete record');
    } else if (this.formAction === 'Update'){
      console.log('Update record');
    }
  }

  public applyFilter() {
    console.log("search");
  }
}
