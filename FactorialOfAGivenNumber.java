import java.util.Scanner;

public class FactorialOfAGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,fact=1;
		System.out.println("Enter a number: ");
		a=sc.nextInt();
		for(int i=a;i>0;i--) {
			fact*=i;
		}
		System.out.println("Factorial is : "+ fact);

	}

}
