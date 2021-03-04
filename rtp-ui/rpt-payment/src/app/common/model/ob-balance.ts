export class ObBalance {
  AccountId: string;
  Amount: {
    Amount: string;
    Currency: string;
  };
  CreditDebitIndicator: string;
  Type: string;
  DateTime: string;
  CreditLine: [
    {
      Included: boolean;
      Amount: {
        Amount: string;
        Currency: string;
      },
      Type: string;
    }
  ];
}
