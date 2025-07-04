import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../../employee';
import { FormsModule } from '@angular/forms';
import { EmployeeService } from '../../employee.service';


@Component({
  selector: 'app-employee-details',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './employee-details.component.html',
  styleUrl: './employee-details.component.css'
})
export class EmployeeDetailsComponent implements OnInit {

  id: number = 0
  employee!: Employee;
  constructor(private route: ActivatedRoute, private employeService: EmployeeService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.employee = new Employee();
    this.employeService.getEmployeeById(this.id).subscribe(data => {
      this.employee = data;
    });
  }
}
