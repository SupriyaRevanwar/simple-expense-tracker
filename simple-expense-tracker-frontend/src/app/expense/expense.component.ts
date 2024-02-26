import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { UserAddService } from '../user-add.service';
import { User } from '../user';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-expense',
  templateUrl: './expense.component.html',
  styleUrls: ['./expense.component.css']
})
export class ExpenseComponent implements OnInit{
  users: User[];
  upd: User=new User();
  constructor(private service:UserAddService, private router:Router ) { }
  
     
ngOnInit(): void{
   let resp=this.service.getexpenses();
     resp.subscribe((data)=>this.users=data);
  
}
 public deleteUser(id:string){
  // let resp= this.service.deletexpense(this.id);
  //  resp.subscribe((data)=>this.user=data);
  this.service.deletexpense(id).subscribe(data=>{
    console.log(data);
    this.gotoexp();
  })
}
gotoexp(){
  //this.router.navigate(['/expenses']);
  this.service.getexpenses();
}
 
  onSubmit(id:string){
    this.service.editexp(id).subscribe(data=>{
      console.log(data);
      this.gotoexp();
    })
  }
 
}
