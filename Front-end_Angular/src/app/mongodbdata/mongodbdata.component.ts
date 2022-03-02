import { Component, OnInit } from '@angular/core';
import { UserBookingService } from '../user-booking.service';
@Component({
  selector: 'app-mongodbdata',
  templateUrl: './mongodbdata.component.html',
  styleUrls: ['./mongodbdata.component.css']
})
export class MongodbdataComponent implements OnInit {
  users:any;
  email:string;
  constructor(private service:UserBookingService) { }
  public delteUser(id:number){
    let resp= this.service.deleteUser(id);
    resp.subscribe((data)=>this.users=data);
   }
   
   public findUserByEmailId(){
     let resp= this.service.getUserByEmail(this.email);
     resp.subscribe((data)=>this.users=data);
    }
  ngOnInit() {
    let resp=this.service.getUsers();
    resp.subscribe((data)=>this.users=data);
  }

}
