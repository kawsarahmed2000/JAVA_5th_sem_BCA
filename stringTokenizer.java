import java.util.StringTokenizer;

public class stringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer s = new StringTokenizer("My name is kawsar");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}

	}

}
