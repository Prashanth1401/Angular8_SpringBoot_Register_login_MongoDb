import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShopefurnitureComponent } from './shopefurniture.component';

describe('ShopefurnitureComponent', () => {
  let component: ShopefurnitureComponent;
  let fixture: ComponentFixture<ShopefurnitureComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShopefurnitureComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShopefurnitureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
