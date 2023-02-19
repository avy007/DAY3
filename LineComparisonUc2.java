package DAY3ASSINGMENT;

public class LineComparisonUc2 {

	public static void main(String[] args) {
		int x1=1; int y1=1; int x2=1; int y2=1;
		int l2x1=1; int l2y1=1; int l2x2=1; int l2y2=1;
		
		int line1=(int) Math.sqrt(Math.pow(x2-x1,2) +(Math.pow(y2-y1, 2)));
        System.out.println(line1);
        int line2=(int) Math.sqrt(Math.pow(l2x2-l2x1, 2)+(Math.pow(l2y2-l2y1, 2)));
        System.out.println(line2);
        
       Integer obj1= new Integer(line1);
       Integer obj2= new Integer(line2);
       System.out.println(obj1.equals(obj2));
       
	}

}
