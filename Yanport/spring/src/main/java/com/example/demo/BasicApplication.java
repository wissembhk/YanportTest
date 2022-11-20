package com.example.demo;

import java.util.Scanner;

import com.example.demo.entities.InputEntity;
import com.example.demo.enums.OrientationEnum;

public class BasicApplication {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("entrer la position initial de l'aspirateur");
	System.out.print("x initial=");
	int xinit= Integer.parseInt(scan.nextLine());
	System.out.print("y initial=");
	int yinit= Integer.parseInt(scan.nextLine());
	
	System.out.print("orientation=");
	OrientationEnum orientation=OrientationEnum.valueOf( scan.nextLine());
	
	System.out.print("instructions=");
	String instructions=scan.nextLine();

	
	System.out.println("entrer la dimension de la grille");
	System.out.print("x=");
	int x= scan.nextInt();
	System.out.print("y=");
	int y= scan.nextInt();
	
	InputEntity b = new InputEntity(x, y, xinit, yinit, orientation, instructions);
	
	 OrientationEnum orientationFinale = b.getOrientation();
     int currentX=b.getInitialX();
     int currentY=b.getInitialY();
		for(int i=0 ; i < b.getInstructions().length();i++)
		{	
			if (b.getInstructions().charAt(i)=='D')
			{
				orientationFinale=orientationFinale.next();
			}
			else {
				if (b.getInstructions().charAt(i)=='G')
				{
					orientationFinale=orientationFinale.prev();
				}
			}
			if(b.getInstructions().charAt(i)=='A') {
				switch (orientationFinale) {
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
			if (currentX<1 || currentY<1 || currentX>b.getX() || currentY>b.getY())
				break ;
		}
if (currentX<1 || currentY<1 || currentX>b.getX() || currentY>b.getY()) {
	System.out.print("Instruction invalide: votre aspirateur va quitter la chambre ");
}
System.out.print("x="+currentX);
System.out.print(" y="+currentY);
System.out.println(" orientation="+orientationFinale);




	}
}
