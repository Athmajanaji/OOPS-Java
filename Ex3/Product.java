import java.util.*;
class Product{
	int pcode,price;
        String pname;  
       public void display(){
         Scanner obj = new Scanner(System.in);
	System.out.print("Enter Product Name: ");
         pname= obj.nextLine();
        System.out.println("Enter Product Code: ");
        pcode = obj.nextInt();
	System.out.println("Enter Product Price: ");
        price = obj.nextInt();
	 System.out.println("Producr Code = "+pcode);
	 System.out.println("Producr Name = "+pname);
	 System.out.println("Producr Price = "+price);
         System.out.println();
	}

  public static void main(String args[]){
        
	Product p1 =new Product();
	
        p1.display();

	Product p2 =new Product();
	
        p2.display();

	Product p3 =new Product();
	
        p3.display();

        if(p1.price < p2.price && p1.price<p3.price){
         System.out.println("Lowest Price is "+p1.price);
        }
        else if(p2.price < p3.price){
	System.out.println("Lowest Price is "+p2.price);
        }
	else{
	 System.out.println("Lowest Price is "+p3.price); 	
	}
        
}
}
