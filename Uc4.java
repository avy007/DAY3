package DAY3ASSINGMENT;

import java.util.Random;

public class Uc4 {

	public static void main(String[] args) {
		//Solving using Switch Case Statement
		Random obj=new Random();
		
		int emppresint=1;
		int perhr=20;
		int fullday=10;
		int parttime=8;
		
		int check=obj.nextInt(2); //0 1
		
		switch(check) {
		
		case 1:System.out.print("emp present fulltime ");
		       System.out.println(" daily wage "+perhr*fullday );
		break;
		
		 default :System.out.println("emp is parttime "+perhr*parttime);
		
		}

	}

}
