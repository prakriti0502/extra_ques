package extra_questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Employee
{
		int empNo;
		int sal;
		String name;
		public void getdetails()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee's Name , Employee's Number and Employee's Salary ");
			name = sc.nextLine();
			empNo = sc.nextInt();
			sal = sc.nextInt();
		}
		public String getName()
		{
			return name;
		}
		public int getEmpNo()
		{
			return empNo;
		}
		public int getSal()
		{
			return sal;
		}
}
class compEmpNo implements Comparator <Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.empNo > o2.empNo) return 1;
		if(o1.empNo < o2.empNo) return -1;
		else return 0;
	}
}
class compName implements Comparator <Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if((o1.name).compareTo(o2.name) > 0) return 1;
		if((o1.name).compareTo(o2.name) < 0) return -1;
		else return 0;
	}
	
}
class compSal implements Comparator <Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.sal > o2.sal) return 1;
		if(o1.sal < o2.sal) return -1;
		else return 0;
	}
	
}
public class ComparablePrac {

	public static void main(String[] args) {
		ArrayList <Employee> arr = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.getdetails();
		Employee e2 = new Employee();
		e2.getdetails();
		Employee e3 = new Employee();
		e3.getdetails();
		Employee e4 = new Employee();
		e4.getdetails();
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		arr.add(e4);
		compEmpNo c1 = new compEmpNo();
		Collections.sort(arr, c1);
		System.out.println("Sorted by empl no.");
		for(Employee r: arr) {
			System.out.println("Empno: " + r.getEmpNo() + " Emp name: " + r.getName() + " Emp salary: " + r.getSal() );
		}
		compSal c2 = new compSal();
		Collections.sort(arr, c2);
		System.out.println("Sorted by salary");
		for(Employee r: arr) {
			System.out.println("Empno: " + r.getEmpNo() + " Emp name: " + r.getName() + " Emp salary: " + r.getSal() );
		}
		compName c3 = new compName();
		Collections.sort(arr, c3);
		System.out.println("Sorted by name");
		for(Employee r: arr) {
			System.out.println("Empno: " + r.getEmpNo() + " Emp name: " + r.getName() + " Emp salary: " + r.getSal() );
		}
	}

}
