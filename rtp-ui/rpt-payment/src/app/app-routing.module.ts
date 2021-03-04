import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClientTasksComponent } from './client-tasks/client-tasks.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { AccountsSnapshotComponent } from './accounts-snapshot/accounts-snapshot.component';
import { HomeScreenComponent } from './home-screen/home-screen.component';

const routes: Routes = [
  { path: '', redirectTo: '/app-home-screen', pathMatch: 'full' },
  { path: 'app-home-screen', component: HomeScreenComponent },
  { path: 'app-accounts-snapshot', component: AccountsSnapshotComponent },
  { path: 'app-client-tasks', component: ClientTasksComponent },
  { path: 'app-user-profile', component: UserProfileComponent },
  { path: '**', redirectTo: '/app-home-screen', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
