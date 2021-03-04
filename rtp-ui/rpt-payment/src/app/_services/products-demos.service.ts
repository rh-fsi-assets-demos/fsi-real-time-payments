import { Injectable } from '@angular/core';
import { of, Observable, BehaviorSubject } from 'rxjs';
import { PRODUCTOFFERINGS } from '../../assets/data/product-offerings';
import { PROJECTDEMO } from '../../assets/data/redhat-demo';
import { REDHATPRODUCTS } from '../../assets/data/redhat-products';
import { ProjectDemo } from '../common/model/project-demo';

@Injectable({
  providedIn: 'root'
})
export class ProductsDemosService {
  private projectDemo: ProjectDemo | null;
  private projectDemo$ = new BehaviorSubject(this.projectDemo);

  constructor() { }

  getProductBenefits() {
    return of(PRODUCTOFFERINGS);
  }

  getRedHatTechnologies() {
    return of(REDHATPRODUCTS);
  }

  getProductDemos() {
    return of(PROJECTDEMO);
  }

  getSelectedDemo() {
    return this.projectDemo$.asObservable();
  }

  setSelectedDemo(projectDemo: ProjectDemo) {
    this.projectDemo = projectDemo;
    this.projectDemo$.next(this.projectDemo);
  }

}

