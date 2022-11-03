
import java.io.*;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		try {
		System.out.println("Enter 1st numeber :");
		a=Integer.parseInt(in.readLine());
		System.out.println("Enter 2nd number :");
		b= Integer.parseInt(in.readLine());
		c=a+b;
		System.out.println("The result is :"+ c);

		}
		catch(Exception e) {
			
		}
	}

}
