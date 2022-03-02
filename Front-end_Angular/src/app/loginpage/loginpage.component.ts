import { Component, OnInit } from '@angular/core';
import { LoginpageService } from '../loginpage.service';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';
import { User2 } from '../user2';
import { JwtClientService } from '../jwt-client.service';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginpageComponent implements OnInit {
  user2: User2=new User2("","");
  message:any;
  authRequest:any={
    "userName":"javatechie",
    "password":"password"
  };
  response:any;
  constructor(

    private LoginService: LoginService,private service:JwtClientService

    ) { }
 
    

  ngOnInit() {
  }

  public registerNow(){
    let resp=this.LoginService.doRegistration(this.user2);
    resp.subscribe((data)=>this.message=data);
      }
      public getAccessToken(authRequest){
        let resp=this.service.generateToken(authRequest);
        resp.subscribe(data=>this.accessApi(data));
          }
        
        
          public accessApi(token){
        let resp=this.service.welcome(token);
        resp.subscribe(data=>this.response=data);
          }
}