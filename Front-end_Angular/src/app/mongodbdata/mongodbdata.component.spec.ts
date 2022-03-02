import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MongodbdataComponent } from './mongodbdata.component';

describe('MongodbdataComponent', () => {
  let component: MongodbdataComponent;
  let fixture: ComponentFixture<MongodbdataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MongodbdataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MongodbdataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
