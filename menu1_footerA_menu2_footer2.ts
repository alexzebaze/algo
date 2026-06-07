
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { Component, NgModule, OnInit } from '@angular/core';
import { ActivatedRoute, NavigationEnd, Router, RouterModule, Routes } from '@angular/router';

@Component({
  selector: 'app-parent',
  template: `<nav>
  <a routerLink="/menu1">Menu1</a>
  <a routerLink="/menu2">Menu2</a>
</nav>
<router-outlet></router-outlet>
<footer-component></footer-component>`,
})
export class PreviewComponent {
  d = new Date(1997,6,1,12,32);
}

@Component({
  selector: 'app-menu1',
  template: '<p>Contenu du Menu1</p>'
})
export class Menu1Component { }

@Component({
  selector: 'app-menu2',
  template: '<p>Contenu du Menu2</p>'
})
export class Menu2Component { }

@Component({
  selector: 'app-footer-a',
  template: '<p>Pied de page A</p>'
})
export class FooterAComponent { }

@Component({
  selector: 'app-footer-b',
  template: '<p>Pied de page B</p>'
})
export class FooterBComponent { }

@Component({
  selector: 'footer-component',
  template: '<ng-container *ngComponentOutlet="footerComponent"></ng-container>'
})
export class FooterWrapperComponent implements OnInit {
  footerComponent: any;

  constructor(private route: ActivatedRoute, private router: Router) {}

  ngOnInit() {
    this.router.events.subscribe(event => {
      if (event instanceof NavigationEnd) {
        const activeRoute = this.route.root.firstChild;
        this.footerComponent = activeRoute?.snapshot.data['footer'] || null;
      }
    });
  }
}

const appRoutes: Routes = [
  { path: 'menu1', component: Menu1Component, data: { footer: FooterAComponent } },
  { path: 'menu2', component: Menu2Component, data: { footer: FooterBComponent } },
  
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

@NgModule({
  declarations: [
    PreviewComponent,
    Menu1Component,
    Menu2Component,
    FooterAComponent,
    FooterBComponent,
    FooterWrapperComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [PreviewComponent]
})
export class AppModule { }
