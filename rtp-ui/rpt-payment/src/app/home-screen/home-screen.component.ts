import { Component, OnInit, Inject, ChangeDetectionStrategy, ViewEncapsulation, ViewChild, ElementRef } from '@angular/core';
import { ProductBenefits } from '../common/model/product-benefits';
import { ProductsDemosService } from '../_services/products-demos.service';
import { ProjectDemo } from '../common/model/project-demo';
import { UserProfile } from '../common/model/user-profile';
import { UserDataService } from '../_services/user-data.service';
import { RedhatTechnologies } from '../../app/common/model/redhat-technologies';
import { RedhatTech } from '../common/model/redhat-tech';

@Component({
  selector: 'app-home-screen',
  templateUrl: './home-screen.component.html',
  styleUrls: ['./home-screen.component.scss']
})
export class HomeScreenComponent implements OnInit {
  @ViewChild('panel', { read: ElementRef }) public panel: ElementRef<any>;
  productBenefits: ProductBenefits[] | null;
  productDemos: ProjectDemo[] | null;
  productDemo: ProjectDemo | null;
  systemUsers: UserProfile | null;
  selectedUser: UserProfile | null;
  selectedProject: ProjectDemo | null;
  users: UserProfile[] | null;
  redhatTech: RedhatTechnologies[] | null;
  projectTech = new Array<any>();
  projectCards = new Array<any>();

  constructor(private productsDemosService: ProductsDemosService, private userDataService: UserDataService) { }

  ngOnInit() {
    // user data
    this.userDataService.getSystemUsers()
      .subscribe((userData: UserProfile[]) => {
        this.users = userData;
      });

    // card information
    this.productsDemosService.getProductBenefits()
    .subscribe((benefits: ProductBenefits[]) => {
      this.productBenefits = benefits;
    });

    // all project types
    this.productsDemosService.getProductDemos()
      .subscribe((demos: ProjectDemo[]) => {
        this.productDemos = demos;
      });

    // selected project
    this.productsDemosService.getSelectedDemo()
    .subscribe((projectDemo: ProjectDemo) => {
      this.productDemo = projectDemo;
      // this.setProject();
    });

    this.productsDemosService.getRedHatTechnologies()
      .subscribe((redhatTechnologies: RedhatTechnologies[]) => {
        this.redhatTech = redhatTechnologies;
      });
  }

  public onPreviousSearchPosition(): void {
    this.panel.nativeElement.scrollLeft -= 200;
  }

  public onNextSearchPosition(): void {
    this.panel.nativeElement.scrollLeft += 200;
  }

  getProductBenefits() {
    return this.productBenefits;
  }

  getUsers() {
    return this.systemUsers;
  }

  setUser($event) {
    this.userDataService.setUser(this.selectedUser);
  }

  setProject() {
    this.productsDemosService.setSelectedDemo(this.selectedProject);
    this.filterRedHatTech();
    this.filterCards();
  }

  private filterRedHatTech() {
    this.projectTech = [];
    for (let i = 0; i < this.selectedProject.redhatTechId.length; i++) {
    // this.selectedProject.redhatTechId.forEach(function(value: number) {
      this.projectTech.push(this.redhatTech[this.selectedProject.redhatTechId[i]]);
    }
  }

  private filterCards() {
    this.projectCards = [];
    for (let i = 0; i < this.selectedProject.productBenefitsId.length; i++) {
      // this.selectedProject.redhatTechId.forEach(function(value: number) {
      this.projectCards.push(this.productBenefits[this.selectedProject.productBenefitsId[i]]);
    }
  }

}
