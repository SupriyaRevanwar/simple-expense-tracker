import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable, map } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class UserAddService {
  private baseURL="http://localhost:8080/expenses";
  constructor(private httpClient:HttpClient) { }

  getexpenses():Observable<User[]>{
    return this.httpClient.get<User[]>(`${this.baseURL}`);
  }

  addexpenses(user:User):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,user);
  }

  getbyname(id:string):Observable<User>{
    return this.httpClient.get<User>(`${this.baseURL}/${id}`);
  }

  updatexpenses(id:string,user:User):Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`,user);
  }

  deletexpense(id:string):Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }

  editexp(id:String):Observable<User>{
    return this.httpClient
    .get<User>(`${this.baseURL}/${id}`)
    .pipe(map((response) => response));
  }


 
}
