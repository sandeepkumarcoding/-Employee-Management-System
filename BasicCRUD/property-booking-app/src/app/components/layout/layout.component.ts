import { Component } from '@angular/core';
import { Router, RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
import { LocalStorageService } from '../../services/local-storage.service';

@Component({
  selector: 'app-layout',
  standalone: true,
  imports: [RouterOutlet, RouterLink, RouterLinkActive],
  templateUrl: './layout.component.html',
  styleUrl: './layout.component.css'
})
export class LayoutComponent {

   constructor(
    private localStorageService: LocalStorageService,
    private router: Router
  ) {}

  logout() {
    this.localStorageService.remove('auth-key');
    this.router.navigate(['/login']);
  }
}
