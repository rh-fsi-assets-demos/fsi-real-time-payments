import { Component, OnInit } from '@angular/core';
import { UserDataService } from './_services/user-data.service';
import { UserProfile } from './common/model/user-profile';
import { ProductsDemosService } from './_services/products-demos.service';
import { ProjectDemo } from './common/model/project-demo';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  user: UserProfile | null;
  productDemos: ProjectDemo[] | null;

  constructor(private userDataService: UserDataService, private productsDemosService: ProductsDemosService) { }

  ngOnInit(): void {
    this.userDataService.getUser()
      .subscribe((userData: UserProfile) => {
        this.user = userData;
      });

    this.productsDemosService.getProductDemos()
      .subscribe((demos: ProjectDemo[]) => {
        this.productDemos = demos;
      });
  }
}
