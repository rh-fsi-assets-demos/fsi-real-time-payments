import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MaintainPayeeDialogComponent } from './maintain-payee-dialog.component';

describe('MaintainPayeeComponent', () => {
  let component: MaintainPayeeDialogComponent;
  let fixture: ComponentFixture<MaintainPayeeDialogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MaintainPayeeDialogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MaintainPayeeDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
