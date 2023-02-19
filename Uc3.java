package DAY3ASSINGMENT;

import java.util.Random;

public class Uc3 {

	public static void main(String[] args) {
		//Calculate Daily Employee Wage
		//assume wage per hour is 20
		// assume full day hour is 10
		// part time hour is 8
		Random obj=new Random();
		int check=obj.nextInt(2); //0 1
		int emppresent=1;
		//int check=1;
		int empparttime=0;
		int perhr=20;
		int fullday=10;
		int pattime=8;
		
		
		if(emppresent==check) {
			System.out.println("emp is full time");
			System.out.println("Daily Employee Wage " +perhr*fullday);
			
		}else {
			System.out.println("emp is part time");
			System.out.println("Daily Employee Wage " +perhr*pattime);
		}

	}

}
