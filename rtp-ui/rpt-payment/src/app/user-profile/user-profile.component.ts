import { Component, OnInit } from '@angular/core';
import { UserDataService } from '../_services/user-data.service';
import { UserProfile } from '../common/model/user-profile';
import { UserProfileData } from '../common/model/user-profile-data';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.scss']
})
export class UserProfileComponent implements OnInit {
  user = new UserProfileData();

  constructor(private userDataService: UserDataService) { }

  ngOnInit(): void {
    this.userDataService.getUser()
      .subscribe((userData: UserProfile) => {
        this.user = userData;
      });
  }

}
