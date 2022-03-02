import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';
import { SerachDeleteComponent } from './serach-delete/serach-delete.component';
import { UserRegistationService } from './user-registation.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { HomepageComponent } from './homepage/homepage.component';
import { AboutComponent } from './about/about.component';
import { HomefurnitureComponent } from './homefurniture/homefurniture.component';
import { OfficefurnitureComponent } from './officefurniture/officefurniture.component';
import { ShopefurnitureComponent } from './shopefurniture/shopefurniture.component';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { BookingComponent } from './booking/booking.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { FavoritepageComponent } from './favoritepage/favoritepage.component';
import { MongodbdataComponent } from './mongodbdata/mongodbdata.component';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    SerachDeleteComponent,
    HomepageComponent,
    AboutComponent,
    HomefurnitureComponent,
    OfficefurnitureComponent,
    ShopefurnitureComponent,
    BookingComponent,
    AdminhomeComponent,
    LoginpageComponent,
    FavoritepageComponent,
    MongodbdataComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    MatSidenavModule,
    MatListModule,
    MatIconModule,
    MatToolbarModule,
    MatCardModule,
    MatButtonModule

  ],
  providers: [UserRegistationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
