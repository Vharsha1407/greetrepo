package emp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Empsys {
	public static void main(String[] args) {
		Emp e1=new Emp(100,"ajay",23,34455);
		Emp e2=new Emp(101,"anu",23,34465);
		Emp e3=new Emp(102,"amal",23,34655);
		Emp e4=new Emp(103,"hema",23,34455);
		
		ArrayList<Emp> list=new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Emp e:list) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary());
		}
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Emp id to be find");
		int id=s.nextInt();
		boolean flag=false;
		for(Emp e:list) {
			if(e.getId()==id) {
				flag=true;
				System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary());
			}
		}
		if (flag==false) {
			System.out.println("Employee id is not existing in the list");
		}
		//get all employee u have to sort by name
		System.out.println("****************");
		for(Emp e:list) {
			Comparator<Emp> con=(o1,o2)-> o1.getId()
		}
		
		//update one employee
		
		//delete employee by id
		System.out.println("Enter the Employee id to be deleted");
		int eid=s.nextInt();
		boolean flag1=false;
		for(Emp e:list) {
			if(e.getId()==eid) {
				flag=true;
				list.remove(e);
			}
			
		}
		if (flag1==false) {
			System.out.println("Employee id is not existing in the list to be deleted");
		}
	}

}
