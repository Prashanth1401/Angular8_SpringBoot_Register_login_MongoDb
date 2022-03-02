import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OfficefurnitureComponent } from './officefurniture.component';

describe('OfficefurnitureComponent', () => {
  let component: OfficefurnitureComponent;
  let fixture: ComponentFixture<OfficefurnitureComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OfficefurnitureComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OfficefurnitureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
