import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { SolutionComponent } from './solution/solution.component';

const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "solution", component: SolutionComponent }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
