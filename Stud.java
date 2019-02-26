import java.util.*;
import java.util.ArrayList;

class Student4
{
	int id;
	String name;
	String department;
	Integer salary;
	
	public Student4(int id , String name, String department, Integer salary)
	{
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
}


class Sortbydepartment implements Comparator<Student4>
	{

@Override

public int compare(Student4 A, Student4 B) {
	// TODO Auto-generated method stub
	return A.department.compareTo(B.department);
}

	}
class Sortbysalary implements Comparator<Student4>
{
	public int compare(Student4 a, Student4 b)
	{
		return a.salary.compareTo(b.salary);
	}
}

public class Stud {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student4> ss = new ArrayList<Student4>();
		
		Student4 s1 = new Student4(11,"Nikita","HR",50000);
		Student4 s2 = new Student4(12,"Neeti","IT",40000);
		Student4 s3 = new Student4(13,"Harsh","Bank",30000);
	    Student4 s4 = new Student4(14,"Gaurav","Fianance",20000);
		Student4 s5 = new Student4(15,"komal","Accounts",10000);
		Student4 s6 = new Student4(16,"Astha","HR",60000);
		Student4 s7 = new Student4(17,"Kanika","HR",70000);
		Student4 s8 = new Student4(18,"Megha","IT",80000);
		Student4 s9 = new Student4(19,"Nia","IR",46000);
		Student4 s10 = new Student4(20,"Rajitha","HR",28000);
		
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);
		ss.add(s6);
		ss.add(s7);
		ss.add(s8);
		ss.add(s9);
		ss.add(s10);
		
		Collections.sort(ss,new Sortbydepartment());
		
		for(Student4 s:ss)
		{
			System.out.println(s.id+" "+s.name+" "+s.department+" "+s.salary);
		}
		
		System.out.println("**************************************");
		
		Collections.sort(ss, Collections.reverseOrder(new Sortbysalary()));
		
		for(Student4 s:ss)
		{
			System.out.println(s.id+" "+s.name+" "+s.department+" "+s.salary);
		}
	}
}
