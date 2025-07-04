import { Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AuthGuard } from './guards/auth.guard';
import { RegisterComponent } from './components/register/register.component';
import { LayoutComponent } from './components/layout/layout.component';
import { CreateEmployeeComponent } from './components/create-employee/create-employee.component';
import { EmployeeListComponent } from './components/employee-list/employee-list.component';
import { EmployeeDetailsComponent } from './components/employee-details/employee-details.component';
import { UpdateEmployeeComponent } from './components/update-employee/update-employee.component';
export const routes: Routes = [
    { path: '', redirectTo: 'login', pathMatch: 'full' },
    { path: 'login', component: LoginComponent },
    // {path: 'dashboard', component: DashboardComponent, canActivate: [AuthGuard]},
    { path: 'register', component: RegisterComponent },
    {
        path: '', component: LayoutComponent,
        children: [
            { path: 'dashboard', component: DashboardComponent, canActivate: [AuthGuard] },
            { path: 'dash', component: DashboardComponent, canActivate: [AuthGuard] },
            { path: 'youHavetoAddAndConfigureInRoutingFile', component: DashboardComponent, canActivate: [AuthGuard] },
            { path: 'createEmp', component: CreateEmployeeComponent, canActivate: [AuthGuard] },
            { path: 'emplist', component: EmployeeListComponent, canActivate: [AuthGuard] },
            { path: 'empDetails', component: EmployeeDetailsComponent, canActivate: [AuthGuard] },
            { path: 'updateEmp', component: UpdateEmployeeComponent, canActivate: [AuthGuard] },
        ]
    }
];
