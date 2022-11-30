import java.util.Scanner;

public class demoException2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			int a[]=new int[5];
			//a[5]=30/1;
//			a[2]=in.nextInt();
//			System.out.println(a[10]);
			String s = null;
			System.out.println(s.length());
//			int data = 100/0;
		}
		catch(ArithmeticException e) {System.out.println(e);}
		catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}
		catch(NullPointerException e) {System.out.println(e);}
		catch(Exception e) {System.out.println(e);}
		System.out.println("Rest of the code");

	}

}
