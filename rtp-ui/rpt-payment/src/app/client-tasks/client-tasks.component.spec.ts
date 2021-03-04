import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ClientTasksComponent } from './client-tasks.component';

describe('ClientTasksComponent', () => {
  let component: ClientTasksComponent;
  let fixture: ComponentFixture<ClientTasksComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ClientTasksComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ClientTasksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
