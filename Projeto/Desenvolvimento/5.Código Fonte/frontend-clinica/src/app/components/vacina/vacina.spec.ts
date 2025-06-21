import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Vacina } from './vacina';

describe('Vacina', () => {
  let component: Vacina;
  let fixture: ComponentFixture<Vacina>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Vacina]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Vacina);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
