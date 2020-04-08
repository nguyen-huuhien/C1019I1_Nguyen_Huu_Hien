import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule} from '@angular/router';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import { FormsModule } from '@angular/forms'

import { HomeComponent } from './components/home/home.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { EmployeeListComponent } from './components/employees/employee-list/employee-list.component';
import { EmployeeAddComponent } from './components/employees/employee-add/employee-add.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-add', component: EmployeeAddComponent},

  {path: '**', component: PageNotFoundComponent}
];
@NgModule({
  declarations: [HomeComponent, PageNotFoundComponent, EmployeeListComponent, EmployeeAddComponent],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes),
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginationModule
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
