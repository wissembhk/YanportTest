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
  error: string = "";
  ngOnInit(): void {

  }
  AddClient() {
  if( this.validateinstructions())
    this.myservice.Calcul(this.inputdata).subscribe(
      res => {
        this.outputdata = res
        console.log(res)
      }
    );
    else
    this.error=this.error;





  }
  validateinstructions(){
    this.error=""
    if(this.inputdata.instructions)
    for(var i=0;i<this.inputdata.instructions.length;i++)
      if ((this.inputdata.instructions[i]!='D' && this.inputdata.instructions[i]!='A' && this.inputdata.instructions[i]!='G' ))
        { 
          this.error="instructions doit contenir seulement une suite de A,D et G" ;
          console.log(this.error)
          return false ; 
        }
        return true ;
  }
}





