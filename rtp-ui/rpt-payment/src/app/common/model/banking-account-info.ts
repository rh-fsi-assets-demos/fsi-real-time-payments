export class BankingAccountInfo {
  userId: string;
  routingNum: string;
  accountNum: string;
  accountType: string;
  name: string;
  description: string;
  balance: number;
  dateAdded: string;
  dateRemove: string;

  constructor(name: string, routingNum: string, accountNum: string, accountType: string){
    this.name = name;
    this.routingNum = routingNum;
    this.accountNum = accountNum;
    this.accountType = accountType;
  }
}
