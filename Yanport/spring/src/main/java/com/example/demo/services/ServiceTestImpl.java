package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.InputEntity;
import com.example.demo.entities.OutputEntity;
import com.example.demo.enums.OrientationEnum;

@Service
public class ServiceTestImpl {
	
	
	public OutputEntity direction(InputEntity input)
	{
		 OrientationEnum orientation = input.getOrientation();
	        int currentX=input.getInitialX();
	        int currentY=input.getInitialY();
			for(int i=0 ; i < input.getInstructions().length();i++)
			{	
				if (input.getInstructions().charAt(i)=='D')
				{
					orientation=orientation.next();
				}
				else {
					if (input.getInstructions().charAt(i)=='G')
					{
						orientation=orientation.prev();
					}
				}
				if(input.getInstructions().charAt(i)=='A') {
					switch (orientation) {
						case N:
							currentY++;
							break;
						case E:
							currentX++;
							break;
						case S:
							currentY--;
							break;
						case O:
							currentX--;
						
					}
					
				}
				if (currentX<1 || currentY<1 || currentX>input.getX() || currentY>input.getY())
					return new OutputEntity("vos instructions  sont invalide: aspirateur ne peux pas quitter la chambre");
			}

return new OutputEntity(currentX, currentY, orientation);
	}

}
