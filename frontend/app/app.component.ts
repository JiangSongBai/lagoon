import {Component} from '@angular/core';
import {HomeComponent} from './components/home.component';
import {NavBar} from './components/nav-bar.component';

import {RouteConfig, ROUTER_DIRECTIVES} from '@angular/router-deprecated';
import {ROUTER_PROVIDERS} from '@angular/router-deprecated';

import {Register} from './components/register.component';

@Component({
  selector: 'my-app',
  directives: [HomeComponent, NavBar, ROUTER_DIRECTIVES],
  providers: [ROUTER_PROVIDERS],
  template:  `
  <nav-bar></nav-bar>
  <router-outlet></router-outlet>
  `
})
@RouteConfig([
  {path: '/home', name: 'Home', component: HomeComponent, useAsDefault: true},
  {path: '/register', name: 'Register', component: Register}
])
export class AppComponent { }
