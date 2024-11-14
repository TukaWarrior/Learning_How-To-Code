import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-square',
  standalone: true,
  imports: [],
  template: `
    <p>
      <button>{{value}}</button>
    </p>
  `,
  styles: ``
})
export class SquareComponent {

  @Input()
  value!: 'X' | 'O';

}
