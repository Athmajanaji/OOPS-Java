import java.util.*;
class Complex{
 double real;
 double imaginary;

 Complex(double r,double i){ real = r;
           imaginary = i;
  };
  public static void main(String[] a){
  	Complex c1 = new Complex(2.0,4.0);
        Complex c2 = new Complex(4.0,8.0);
        System.out.println("First Real Number "+c1.real+"+"+c1.imaginary+"i");
	System.out.println("Second Real Number "+c2.real+"+"+c2.imaginary+"i");
	System.out.println("A + B = "+(c1.real+c2.real)+"+"+(c1.imaginary+c2.imaginary)+"i");
  }
 }
