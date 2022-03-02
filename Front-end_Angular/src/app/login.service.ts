import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  public doRegistration(user2){
    return this.http.post("http://localhost:8084/login",user2,{responseType:'text' as 'json'});
  }
}
