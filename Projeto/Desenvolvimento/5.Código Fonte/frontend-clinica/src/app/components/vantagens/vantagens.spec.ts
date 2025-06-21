import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Vantagens } from './vantagens';

describe('Vantagens', () => {
  let component: Vantagens;
  let fixture: ComponentFixture<Vantagens>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Vantagens]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Vantagens);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
