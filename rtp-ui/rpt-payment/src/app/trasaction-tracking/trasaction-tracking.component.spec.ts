import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrasactionTrackingComponent } from './trasaction-tracking.component';

describe('TrasactionTrackingComponent', () => {
  let component: TrasactionTrackingComponent;
  let fixture: ComponentFixture<TrasactionTrackingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrasactionTrackingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrasactionTrackingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
