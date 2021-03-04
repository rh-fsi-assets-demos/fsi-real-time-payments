import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MaterialModule } from '../material-module';
import { FlexLayoutModule } from '@angular/flex-layout';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ClientPaymentComponent } from './client-payment/client-payment.component';
import { TrasactionProgressComponent } from './trasaction-progress/trasaction-progress.component';
import { TrasactionTrackingComponent } from './trasaction-tracking/trasaction-tracking.component';
import { ClientTasksComponent } from './client-tasks/client-tasks.component';
import { PaymentHistoryComponent } from './payment-history/payment-history.component';
import { AnalyticsDashboardComponent } from './analytics-dashboard/analytics-dashboard.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { AccountsSnapshotComponent } from './accounts-snapshot/accounts-snapshot.component';
import { PaymentConfirmationComponent } from './payment-confirmation/payment-confirmation.component';
import { MaintainAccountDialogComponent } from './maintain-account-dialog/maintain-account-dialog.component';
import { MaintainPayeeDialogComponent } from './maintain-payee-dialog/maintain-payee-dialog.component';
import { HomeScreenComponent } from './home-screen/home-screen.component';
import { ProductsDemosService } from './_services/products-demos.service';
import { AccountInfoService } from './_services/account-info.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ClientPaymentComponent,
    TrasactionProgressComponent,
    TrasactionTrackingComponent,
    ClientTasksComponent,
    PaymentHistoryComponent,
    AnalyticsDashboardComponent,
    UserProfileComponent,
    AccountsSnapshotComponent,
    PaymentConfirmationComponent,
    MaintainAccountDialogComponent,
    MaintainPayeeDialogComponent,
    HomeScreenComponent
  ],
  imports: [
    MaterialModule,
    BrowserModule,
    AppRoutingModule,
    FlexLayoutModule,
    ReactiveFormsModule,
    FormsModule,
    BrowserAnimationsModule,
    HttpClientModule  ],
  entryComponents: [
    HomeScreenComponent
  ],
  providers: [
    ProductsDemosService,
    AccountInfoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
