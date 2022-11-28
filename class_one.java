
class Emp
{

	int empNo; //Declaring variable
	void pushEmpNo(int number) { //Defining member function or method
		empNo=number;
	}
	void getEmpNo() {
		System.out.println("Enployee number is : "+empNo);
	}
}

class EmpName extends Emp {
	String name;
	void pushName(String n) {
		name = n;
	}
	void getNmae() {
		System.out.println("Employee name is : "+name );
	}
}
class EmpJobTitle extends EmpName{
	String title; 
	void pushTitle(String t) {
		title = t;
	}
	
	void getTitle() {
		System.out.println("Employee title is : "+title);
	}
}
class EmpDetails extends EmpJobTitle
{
	void getEmpDetails(int no ,String name,String title) {
		pushEmpNo(no);
		pushName(name);
		pushTitle(title);
		getEmpNo();
		getNmae();
		getTitle();
	}

}

public class class_one {

	public static void main(String[] args) {

		EmpDetails e = new EmpDetails(); //Object creation or instantiation
		e.getEmpDetails(10,"Kawsar","Android developer"); // Calling method means accessing class members

	}

}
