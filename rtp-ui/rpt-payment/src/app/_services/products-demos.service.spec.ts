import { TestBed } from '@angular/core/testing';

import { ProductsDemosService } from './products-demos.service';

describe('ProductsDemosService', () => {
  let service: ProductsDemosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductsDemosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
