import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AccountsSnapshotComponent } from './accounts-snapshot.component';

describe('AccountsSnapshotComponent', () => {
  let component: AccountsSnapshotComponent;
  let fixture: ComponentFixture<AccountsSnapshotComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AccountsSnapshotComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AccountsSnapshotComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
