import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class UserBookingService {
  findUserByEmailId(email: string) {
    throw new Error('Method not implemented.');
  }

  constructor(private http:HttpClient) { }
  public doRegistration(user1){
    return this.http.post("http://localhost:9003/api/v2/register",user1,{responseType:'text' as 'json'});
  }

   public getUsers(){
     return this.http.get("http://localhost:9003/api/v2/getAllUsers");
   }

  public getUserByEmail(email){
    return this.http.get("http://localhost:9003/findUser/"+email);
  }

  // public deleteUser(id){
  //   return this.http.delete("http://localhost:9003/cancel/"+id);
  // }
}
