import { ObAccount } from './ob-account';
import { ObAmounts } from './ob-amounts';
import { ObRemittance } from './ob-remittance';

export class ObInitiation {
  InstructionIdentification: string;
  EndToEndIdentification: string;
  InstructedAmount: ObAmounts;
  DebtorAccount: ObAccount;
  CreditorAccount: ObAccount;
  RemittanceInformation: ObRemittance;

  constructor() {
    this.DebtorAccount = new ObAccount();
    this.CreditorAccount = new ObAccount();
    this.InstructedAmount = new ObAmounts();
    this.RemittanceInformation = new ObRemittance();
  }
}
