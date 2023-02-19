package DAY3ASSINGMENT;

public class Uc6 {

	public static void main(String[] args) {
		//Calculate Wages till
		//a condition of total
		//working hours or
		//days is reached for
		//a month - Assume 100 hours and 20 days
		
		int emppresent=1;
		int check=1;
		int perhr=20;
		int fulltime=10;
		int day=20;
		int perdaywage=perhr*fulltime;
		if (emppresent==check) {
			for(int i=1; i<=day; i++) {
				
				System.out.print("wage for day "+i );
				//System.out.println(" = "+perhr*fulltime);
				System.out.println(" "+ i*perdaywage);
				if(i==day) {
					System.out.println("total wage "+i*perdaywage);
					
				}
				
			}
			
			
			
		}
		
		

	}

}
