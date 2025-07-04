import { HttpClient, HttpEvent, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoginRequest } from '../models/login-request';
import { Observable } from 'rxjs';
import { LoginResponse } from '../models/login-response';
import { SignupRequest } from '../models/signup-request';
import { SignupResponse } from '../models/signup-response';
import { Property } from '../models/property';
import { PropertyResponse } from '../models/master';
import { DashboardComponent } from '../components/dashboard/dashboard.component';
import { DashboardResponse } from '../models/dashboard-response';

const BASE_URL = "http://localhost:9999/api";

@Injectable({
  providedIn: 'root'
})
export class IntegrationService {

  constructor(private http: HttpClient) { }

  doLogin(request: LoginRequest): Observable<LoginResponse> {
    return this.http.post<LoginResponse>(BASE_URL + "/doLogin", request);
  }

  dashboard(): Observable<DashboardResponse> {
    return this.http.get<DashboardResponse>(BASE_URL + "/dashboard");
  }

  doRegister(request: SignupRequest): Observable<SignupResponse> {
    return this.http.post<SignupResponse>(BASE_URL + "/doRegister", request);
  }

  saveProperty(request: Property): Observable<PropertyResponse> {
    return this.http.post<PropertyResponse>(BASE_URL + "/savePropertyDetails", request);
  }

  getPropertyById(id: number): Observable<Property> {
    return this.http.get<Property>(BASE_URL + '/getPropertyById?id=' + id)
  }

  getAllProperety(): Observable<Property[]> {
    return this.http.get<Property[]>(BASE_URL + "/getAllProperty");
  }

  deletePropertyById(id: number): Observable<any> {
    return this.http.delete<any>(BASE_URL + '/deletePropertyById?id=' + id)
  }

  upload(file: File, id: number) {
    const formData: FormData = new FormData();
    formData.append('file', file);

    const req = new HttpRequest('POST', BASE_URL + `/uploadFilesIntoDB?id=` + id, formData, {
      responseType: 'text'
    })

    return this.http.request(req);
  }

}
