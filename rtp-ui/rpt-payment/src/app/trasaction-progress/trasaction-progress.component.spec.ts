import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrasactionProgressComponent } from './trasaction-progress.component';

describe('TrasactionProgressComponent', () => {
  let component: TrasactionProgressComponent;
  let fixture: ComponentFixture<TrasactionProgressComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrasactionProgressComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrasactionProgressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
