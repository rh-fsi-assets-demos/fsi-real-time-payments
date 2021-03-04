import { ObInitiation } from './ob-initiation';
import { ObPartyToParty } from './ob-party-to-party';

export class PartyToParty {
  Initiation: ObInitiation;

  // test: string;

  constructor(instructionIdentification: string, endToEndIdentification: string, amount: string, currency: string,
              daSchemeName: string, daIdentification: string, daName: string, daSecondaryIdentificaiton: string,
              caSchemeName: string, caIdentification: string, caName: string, CaSecondaryIdentificaiton: string,
              reference: string, unstructured: string) {
    this.Initiation = new ObInitiation();

    this.Initiation.InstructionIdentification = instructionIdentification;
    this.Initiation.EndToEndIdentification = endToEndIdentification;
    // this.Initiation.InstructedAmount.Amount = amount;
    // this.Initiation.InstructedAmount.Currency = currency;
    this.Initiation.DebtorAccount.SchemeName = daSchemeName;
    this.Initiation.DebtorAccount.Identification = daIdentification;
    this.Initiation.DebtorAccount.Name = daName;
    this.Initiation.CreditorAccount.SchemeName = caSchemeName;
    this.Initiation.CreditorAccount.Identification = caIdentification;
    this.Initiation.CreditorAccount.Name = caName;
    this.Initiation.RemittanceInformation.Reference = reference;
    this.Initiation.RemittanceInformation.Unstructured = unstructured;
  }

  // constructor(test: string){
  //   this.test = test;
  // }

}
