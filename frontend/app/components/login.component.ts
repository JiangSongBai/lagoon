import {Component} from '@angular/core';
import {Observable} from 'rxjs/Observable';
//import {loginService} from '../services/login.service';

@Component({
  selector:'login',
  templateUrl: 'app/components/login.component.html'
})
export class Login {
  private model = {'username':'', 'password':''};
  private currentUserName;

  onSubmit() {
    //TODO
  }
}
