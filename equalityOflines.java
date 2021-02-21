import java.util.Scanner;
import java.lang.Math;
class equalityOflines{
	public static void main(String[] args){

		System.out.println("Enter coordinates of point to get the length");
		Scanner sc = new Scanner(System.in);
		System.out.println("Coordinates for line 1");
		System.out.print("x1: ");
		int x1 = sc.nextInt();
		System.out.print("y1: ");
		int y1 = sc.nextInt();
		System.out.print("x2: ");
		int x2 = sc.nextInt();
		System.out.print("y2: ");
		int y2 = sc.nextInt();

		System.out.println("Coordinates for line 2");
		System.out.print("p1: ");
      int p1 = sc.nextInt();
      System.out.print("q1: ");
      int q1 = sc.nextInt();
      System.out.print("p2: ");
      int p2 = sc.nextInt();
      System.out.print("q2: ");
      int q2 = sc.nextInt();

		float length1 = (float)Math.sqrt( Math.pow( (x2-x1),2 ) + Math.pow( (y2-y1),2 ) );
		float length2 = (float)Math.sqrt( Math.pow( (p2-p1),2 ) + Math.pow( (q2-q1),2 ) );
		Float objA = length1;
		Float objB = length2;
		System.out.println("lenght of line1 is "+length1);
		System.out.println("lenght of line2 is "+length2);
		boolean result = objA.equals(objB);
		if(result){
			System.out.println("Line1 and Line2 are equal in length");
		}
		else{
			System.out.println("Line1 and Line2 are not equal");
		}
	}
}
