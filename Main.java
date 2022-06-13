import java.util.*;

class Main{
   public static void main(String args[]){

    Scanner s = new Scanner(System.in); 
    int n;
     System.out.println("enter the Number of Employees");
     n = s.nextInt();
    Employee[] obj = new Employee[n] ;
  int eno;
 String ename;


 for(int i=0;i<n;i++)
 {
   System.out.println("Enter The Details Of Employee");
   eno = s.nextInt();
   ename = s.nextLine();     
   obj[i] = new Employee(eno,ename);
  }

 
     for(int i=0;i<n;i++)
 {
  System.out.println("Employee Object "+(i+1)+":");
  obj[i].showData();
 }

 System.out.println();
System.out.println("Search");
 int sid;
  System.out.println("Enter The Id to search");
    sid=s.nextInt();
  for(int i=0;i<n;i++)
 {
    if(obj[i].empId == sid)
	{
 	   System.out.println("Employee Object "+(i+1)+":");
  	   obj[i].showData();	
	}
  }
}
}
class Employee{
  int empId;
  String name;
  //Employee class constructor
  Employee(int eid, String n){
     empId = eid;
     name = n;
  }
public void showData(){
   System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
   System.out.println();
 }
}
