package DAY3ASSINGMENT;

import java.util.Random;

public class Uc1 {

	public static void main(String[] args) {
		
		Random obj=new Random();
		
		int ispresent=1;
		int randomecheck =obj.nextInt(3);
		
		//System.out.println(ramdomecheck);
		
		if(ispresent==randomecheck) {
			
			System.out.println("Emp is Present");
			
		}else {
			System.out.println("Emp is Absent");
		}
		
		

	}

}
