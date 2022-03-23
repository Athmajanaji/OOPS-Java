import java.util.Scanner;
class Perimeter{
    int l,b;
    Perimeter(int l,int b){
    System.out.println("Perimeter = "+2*(l+b));
    }
    Perimeter(){
    Scanner obj = new Scanner(System.in);
 	System.out.println("Enter the breadth");
 	int b=obj.nextInt();
 	System.out.println("Enter the length");
 	int l=obj.nextInt();
 	System.out.println("Perimeter = "+2*(l+b));
    }
}
public class Rectangle{
public static void main(String a[]){
	Perimeter p = new Perimeter(10,2);
        Perimeter p1 = new Perimeter();
 }
}


