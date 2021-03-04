import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders, HttpParams } from '@angular/common/http';
import { of, Observable, throwError } from 'rxjs';
import { retry, catchError, tap } from 'rxjs/operators';
import { ObAccounts } from '../common/model/ob-accounts';
import { ObBalances } from '../common/model/ob-balances';
import { ObTransactions } from '../common/model/ob-transactions';
import { ObPartyToParty } from '../common/model/ob-party-to-party';
import { PartyToParty } from '../common/model/party-to-party';
import { BankingAccountInfo } from '../common/model/banking-account-info';


const httpOptions = {
  headers: new HttpHeaders({
    //'Content-Type':  'application/json',
    'Access-Control-Allow-Headers': 'Origin, X-Requested-With, Content-Type, Accept',
    //'Access-Control-Allow-Methods': 'GET',
    'Access-Control-Allow-Origin': 'http://localhost:4200'
  })
};

@Injectable({
  providedIn: 'root'
})
export class AccountInfoService {
  public first = '';
  public prev = '';
  public next = '';
  public last = '';
  private userId: string;
  private bankUrl = '/ui/';
  private backEndUrl = '/';
  // httpOptions.headers =  httpOptions.headers.set('Authorization', 'my-new-auth-token');
constructor(private http: HttpClient) { }

  getObAccounts(userId: string): Observable<ObAccounts>{
    this.userId = userId;
      return this.http.get<ObAccounts>(this.backEndUrl + 'accounts?accountHolderId=' + userId, httpOptions);
  // getObAccounts() {
  //   return this.http.get<ObAccounts[]>(this.backEndUrl + 'accounts',
  //     {params: new HttpParams({fromString: '_page=1&_limit=20'}), observe: 'response'})
  //     .pipe(retry(3), catchError(this.handleError), tap(res => {
  //     // console.log(res.headers.get('Link'));
  //     this.parseLinkHeader(res.headers.get('Link'));
  //   }));
  }

  getObBalances(accountId: string): Observable<ObBalances>{
    return this.http.get<ObBalances>(this.backEndUrl + 'accounts/' + accountId + '/balances' );
  }

  getObTransactions(accountId: string): Observable<ObTransactions[]>{
    return this.http.get<ObTransactions[]>(this.bankUrl + 'accounts/' + accountId + '/transactions' )
    .pipe(
      catchError(this.handleError)
    );
  }

  getAccountInfo(): Observable<BankingAccountInfo[]>{
    return this.http.get<BankingAccountInfo[]>(this.bankUrl + 'bankAccounts');
  }

  getBalances() {

  }

  addAccountInfo(bankingAccountInfo: BankingAccountInfo) {
    return this.http.post<BankingAccountInfo>(this.bankUrl + 'bankAccounts', bankingAccountInfo)
    .pipe(
      catchError(this.handleError)
    );
  }

  savePartyToPartyPmt(partyToParty: ObPartyToParty): Observable<ObPartyToParty>{
    return this.http.post<ObPartyToParty>(this.backEndUrl + 'domestic-payments', partyToParty, httpOptions)
    .pipe(
      catchError(this.handleError)
      // catchError(this.handleError('make party to party payment', obPartyToParty, httpOptions))
    );
  }

  saveTest(test: string){
    console.log(this.bankUrl + 'Test');
    return this.http.post<string>(this.bankUrl + 'users', {'Testing': test})
    .pipe(
      catchError(this.handleError)
      // catchError(this.handleError('make party to party payment', obPartyToParty, httpOptions))
    );
  }

  parseLinkHeader(header) {
    if (header.length === 0) {
      return ;
    }
    let parts = header.split(',');
    var links = {};
    parts.forEach( p => {
      let section = p.split(';');
      var url = section[0].replace(/<(.*)>/, '$1').trim();
      var name = section[1].replace(/rel="(.*)"/, '$1').trim();
      links[name] = url;

    });

    this.first  = links['first'];
    this.last   = links['last'];
    this.prev   = links['prev'];
    this.next   = links['next'];
  }

  handleError(error: HttpErrorResponse) {
    let errorMessage = 'Unknown error!';
    if (error.error instanceof ErrorEvent) {
      // Client-side errors
      errorMessage = `Error: ${error.error.message}`;
    } else {
      // Server-side errors
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    // window.alert(errorMessage);
    return throwError(errorMessage);
  }
}
