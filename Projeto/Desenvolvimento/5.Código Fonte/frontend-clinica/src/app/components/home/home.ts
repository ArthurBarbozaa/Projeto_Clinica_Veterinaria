import { Component } from '@angular/core';
import { HeaderComponents } from '../header/header';
import { VantagensComponent } from '../vantagens/vantagens';
import { ClinicaComponent } from '../clinica/clinica';
import { VacinaComponent } from '../vacina/vacina';


@Component({
  selector: 'app-home',
  standalone: true,
  imports: [HeaderComponents, VantagensComponent, ClinicaComponent, VacinaComponent],
  templateUrl: './home.html',
  styleUrl: './home.scss'
})
export class HomeComponent {

}
