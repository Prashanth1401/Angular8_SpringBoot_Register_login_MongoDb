import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserRegistationService {

  constructor(private http:HttpClient) { }


  public doRegistration(user){
    return this.http.post("http://localhost:8084/register",user,{responseType:'text' as 'json'});
  }

  public getUsers(){
    return this.http.get("http://localhost:9002/getAllusers");
  }

  public getUserByEmail(email){
    return this.http.get("http://localhost:9002/findUser/"+email);
  }

  public deleteUser(id){
    return this.http.delete("http://localhost:9002/cancel/"+id);
  }
}
