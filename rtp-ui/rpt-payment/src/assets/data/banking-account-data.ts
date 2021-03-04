import { BankingAccountInfo } from '../../app/common/model/banking-account-info';

export const BANKACCOUNTS: BankingAccountInfo[] = [
  {
    userId: '1', routingNum: '123', accountNum: '83729', accountType: 'Checking', name: 'Home Account', description: 'Daily bills',
    balance: 10000, dateAdded: '10/2/2009', dateRemove: ''
  },
  {
    userId: '1', routingNum: '123', accountNum: '93817', accountType: 'Savings', name: 'Education Fund', description: 'Johnny school fund',
    balance: 20000, dateAdded: '10/2/2009', dateRemove: ''
  },
  {
    userId: '1', routingNum: '123', accountNum: '573820', accountType: 'Savings', name: 'Rainy Day', description: 'Financial security',
    balance: 30000, dateAdded: '10/2/2009', dateRemove: ''
  },
  {
    userId: '2', routingNum: '123', accountNum: '837410', accountType: 'Checking', name: 'Monthly Bills', description: 'Personal Checking',
    balance: 25000, dateAdded: '1/24/2001', dateRemove: ''
  },
  {
    userId: '1', routingNum: '123', accountNum: '0391782', accountType: 'Payee', name: 'OUC Utilities', description: 'Home Utilities',
    balance: 350, dateAdded: '10/2/2009', dateRemove: ''
  },
  {
    userId: '1', routingNum: '123', accountNum: '12375783', accountType: 'Payee', name: 'Dillards', description: 'Dillards credit card',
    balance: 500, dateAdded: '10/2/2009', dateRemove: ''
  },
  {
    userId: '1', routingNum: '123', accountNum: '6594277', accountType: 'Payee', name: 'Travel VISA', description: 'Travel expenses',
    balance: 1000, dateAdded: '10/2/2009', dateRemove: ''
  }
];
