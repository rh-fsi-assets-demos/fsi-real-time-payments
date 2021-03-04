import { ObData } from './ob-data';
import { ObRisk } from './ob-risk';

export class ObPartyToParty {
  Data = new ObData();
  Risk = new ObRisk();

  constructor(instructionIdentification: string, endToEndIdentification: string, amount: string, currency: string,
    daSchemeName: string, daIdentification: string, daName: string, daSecondaryIdentificaiton: string,
    caSchemeName: string, caIdentification: string, caName: string, CaSecondaryIdentificaiton: string,
    reference: string, unstructured: string) {
      // this.data = new ObData();

      // this.data.Initiation = new ObInitiation();
      this.Data.Initiation.InstructionIdentification = instructionIdentification;
      this.Data.Initiation.EndToEndIdentification = endToEndIdentification;
      this.Data.Initiation.InstructedAmount.Amount = amount;
      this.Data.Initiation.InstructedAmount.Currency = currency;
      this.Data.Initiation.DebtorAccount.SchemeName = daSchemeName;
      this.Data.Initiation.DebtorAccount.Identification = daIdentification;
      this.Data.Initiation.DebtorAccount.Name = daName;
      this.Data.Initiation.CreditorAccount.SchemeName = caSchemeName;
      this.Data.Initiation.CreditorAccount.Identification = caIdentification;
      this.Data.Initiation.CreditorAccount.Name = caName;
      this.Data.Initiation.RemittanceInformation.Reference = reference;
      this.Data.Initiation.RemittanceInformation.Unstructured = unstructured;
  }
}
