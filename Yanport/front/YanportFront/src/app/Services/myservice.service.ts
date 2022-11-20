import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { inputModel } from '../Models/inputModel';
import { Observable } from 'rxjs';
import { outputModel } from '../Models/outputModel';
@Injectable({
  providedIn: 'root'
})
export class MyserviceService {

  constructor(private http: HttpClient) { }
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }
  Calcul(input: inputModel): Observable<outputModel> {
    const body = JSON.stringify(input);
    return this.http.post<outputModel>('localhost:8089/test', body, this.httpOptions)
  }
}
