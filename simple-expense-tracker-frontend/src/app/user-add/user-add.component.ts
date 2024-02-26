import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserAddService } from '../user-add.service';
import {  Router } from '@angular/router';

@Component({
  selector: 'app-user-add',
  templateUrl: './user-add.component.html',
  styleUrls: ['./user-add.component.css']
})
export class UserAddComponent implements OnInit{
  user: User= new User();
  constructor(private service:UserAddService,
  private router: Router){}
  ngOnInit(): void {
      
  }
  saveExp(){
    this.service.addexpenses(this.user).subscribe( data =>{
      console.log(data);
      this.goToExp();
    },
    error => console.log(error));
  }

  goToExp(){
    this.router.navigate(['/expenses']);
  }
  
  onSubmit(){
    console.log(this.user);
    this.saveExp();
  }
  
  
}
