import { Injectable } from '@angular/core';
import { of, BehaviorSubject } from 'rxjs';
import { SYSTEMUSERS } from '../../assets/data/user-accounts';
import { UserProfile } from '../common/model/user-profile';

@Injectable({
  providedIn: 'root'
})
export class UserDataService {
  private user: UserProfile;
  private user$ = new BehaviorSubject(this.user);

  constructor() { }

  getSystemUsers() {
    return of(SYSTEMUSERS);
  }


  getUser() {
    return this.user$.asObservable();
  }

  setUser(user: UserProfile) {
    this.user = user;
    this.user$.next(this.user);
  }

}
