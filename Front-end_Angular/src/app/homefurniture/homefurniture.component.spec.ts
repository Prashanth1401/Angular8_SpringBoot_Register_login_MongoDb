import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomefurnitureComponent } from './homefurniture.component';

describe('HomefurnitureComponent', () => {
  let component: HomefurnitureComponent;
  let fixture: ComponentFixture<HomefurnitureComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomefurnitureComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomefurnitureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
