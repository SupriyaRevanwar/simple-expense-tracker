import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserAddComponent } from './user-add/user-add.component';
import { ExpenseComponent } from './expense/expense.component';
import { SearchUserComponent } from './search-user/search-user.component';

const routes: Routes = [
  
  {path:"register",component:UserAddComponent},
  {path:"expenses",component:ExpenseComponent},
  {path:"search",component:SearchUserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
