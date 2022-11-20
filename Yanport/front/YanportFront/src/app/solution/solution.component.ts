import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { inputModel } from '../Models/inputModel';
import { outputModel } from '../Models/outputModel';
import { MyserviceService } from '../Services/myservice.service';

@Component({
  selector: 'app-solution',
  templateUrl: './solution.component.html',
  styleUrls: ['./solution.component.css']
})
export class SolutionComponent implements OnInit {

  constructor(private myservice: MyserviceService,) { }
  inputdata: inputModel = new inputModel();
  outputdata: outputModel = new outputModel();
  error: boolean = true;
  ngOnInit(): void {

  }
  AddClient() {
    this.myservice.Calcul(this.inputdata).subscribe(
      res => {
        this.outputdata = res
      }
    );




    console.log(this.error)

  }
}





