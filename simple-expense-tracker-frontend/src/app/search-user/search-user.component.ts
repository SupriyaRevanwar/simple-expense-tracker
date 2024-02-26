import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserAddService } from '../user-add.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search-user',
  templateUrl: './search-user.component.html',
  styleUrls: ['./search-user.component.css']
})
export class SearchUserComponent implements OnInit{
  user: User=new User();
  constructor(private service:UserAddService,
    private router:Router){}
    ngOnInit(): void {
        
    }
    onSubmit(){
      this.service.updatexpenses(this.user.user_name,this.user).subscribe( data =>{
        console.log(data);
        this.goToExp();
      })
    }
    goToExp(){
      this.router.navigate(['/expenses']);
    }

}
