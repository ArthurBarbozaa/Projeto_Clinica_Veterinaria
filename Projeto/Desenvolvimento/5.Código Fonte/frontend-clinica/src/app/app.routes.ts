import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home';
import { LoginComponent } from './pages/login/login';

export const routes: Routes = [
    {
        path: "",
        component: HomeComponent,
    },
    {
        path: "login",        
        component: LoginComponent
        }
];
