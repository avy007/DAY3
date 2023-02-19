package DAY3ASSINGMENT;

import java.util.Random;

public class Uc2 {

	public static void main(String[] args) {
		//Calculate Daily Employee Wage
		//assume wage per hour is 20
		// assume full day hour is 8
		Random obj=new Random(); 
	    int check=obj.nextInt(2); // 0 1
	    
		int emppresent=1;
	
		if(emppresent==check) {
			
			int perhr=20;
			int fullday=8;
			System.out.println("Daily Employee Wage " +perhr*fullday);
		}else {
			System.out.println("emp is absent");
		}
		

	}

}
