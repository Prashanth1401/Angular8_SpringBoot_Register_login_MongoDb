import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { BookingComponent } from './booking/booking.component';
import { FavoritepageComponent } from './favoritepage/favoritepage.component';
import { HomefurnitureComponent } from './homefurniture/homefurniture.component';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { MongodbdataComponent } from './mongodbdata/mongodbdata.component';
import { OfficefurnitureComponent } from './officefurniture/officefurniture.component';

import { RegistrationComponent } from './registration/registration.component';
import { SerachDeleteComponent } from './serach-delete/serach-delete.component';
import { ShopefurnitureComponent } from './shopefurniture/shopefurniture.component';

const routes: Routes = [
  {
    path:"",
    component: HomepageComponent
  },
  {
    path:"home",
    component: HomepageComponent
  },
   {
     path:"register",
     component:RegistrationComponent
    },
   {
     path:"search",
     component:SerachDeleteComponent
    },
    {
      path:"about",
      component:AboutComponent
     },
     {
      path:"homefurnitur",
      component:HomefurnitureComponent
     },
     {
      path:"officefurniture",
      component:OfficefurnitureComponent
     },
     {
      path:"shopfurniture",
      component:ShopefurnitureComponent
     },
     {
       path:"book",
       component:BookingComponent
     },
     {
       path:"adminhome",
       component:AdminhomeComponent
     },
     {
      path:"loginpage",
      component:LoginpageComponent
    },
    {
      path:"invalid",
      component:FavoritepageComponent
    },
    {
      path:"mongodb",
      component:MongodbdataComponent
    }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
