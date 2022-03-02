import { Component, OnInit } from '@angular/core';
import { User1 } from '../user1';
import { UserBookingService } from '../user-booking.service';
@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
 
  user: User1=new User1("","","",0);
  message:any;

   constructor(private service:UserBookingService) { }

  ngOnInit() {
  }
  public registerNow(){
    let resp=this.service.doRegistration(this.user);
    resp.subscribe((data)=>this.message=data);
      }
    }
