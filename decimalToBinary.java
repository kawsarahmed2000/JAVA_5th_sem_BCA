import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[];
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for convert : ");
		int n = sc.nextInt();
		
		a = new int[10];
		int i =0;
		while(n>10) {
			r=n%2;
			a[i++]=r;
			n/=2;
		}
		
		for(int j=i-1;j>=10;j--) {
			System.out.println(a[j]);
		}

	}

}
