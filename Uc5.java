package DAY3ASSINGMENT;

import java.util.Random;

public class Uc5 {

	public static void main(String[] args) {
//Calculating Wages for a Month - Assume 20 Working Day per Month
		int emppresent=1;
		int perhr=20;
		int monthday=20;
		int fulltime=10;
		int parttime=8;
		int permothwage=fulltime*perhr;
		Random obj=new Random();
		int check=obj.nextInt(2); //0 1
		
		if(emppresent==check) {
			System.out.println("emp present full time "+permothwage*monthday);
			
		}else {System.out.println("emp part time "+(parttime*perhr)*monthday);
			
		}
		
	

	}

}
