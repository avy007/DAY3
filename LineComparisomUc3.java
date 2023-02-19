package DAY3ASSINGMENT;
import java.lang.Integer;
public class LineComparisomUc3 {

	public static void main(String[] args) {
		int x1=99; int y1=90; int x2=89; int y2=100;
		int l2x1=3; int l2y1=7; int l2x2=0; int l2y2=8;
		
		int line1=(int) Math.sqrt(Math.pow(x2-x1,2) +(Math.pow(y2-y1, 2)));
        System.out.println("line1 "+line1);
        int line2=(int) Math.sqrt(Math.pow(l2x2-l2x1, 2)+(Math.pow(l2y2-l2y1, 2)));
        System.out.println("line2 s"+line2);
        
       int check=Integer.compare(line1, line2);
       
       if (check==0) {
    	   System.out.println("lines equal");
      
       }if(check==1) {
    	   System.out.println("line1 is greater than line2");
    	   
       }if(check==-1) {
    	   System.out.println("line1 is lessthan line2");
       }
      // Integer obj1= new Integer(line1);
       //Integer obj2= new Integer(line2);
       
      // System.out.println(obj1.compare(line1, line2));

	}

}
