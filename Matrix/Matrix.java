import java.util.Scanner;
class Matrix{
  public static void main(String args[]){
  	int i,j;
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
	int[][] c = new int[10][10];
	Scanner obj = new Scanner(System.in);
	int m,n;
        System.out.println("Enter the size of the matrix ");
        m = obj.nextInt();
	n = obj.nextInt();
	/* Matrix A*/
	System.out.println("Enter the Value for Matrix A ");
	for(i=0;i<m;i++){
	 for(j=0;j<n;j++){
 		a[i][j] = obj.nextInt();
         }
       }
	System.out.println("--------Matrix A-------------- ");
       for(i=0;i<m;i++){
	 for(j=0;j<n;j++){
 		System.out.print(" "+a[i][j]+" ");
         }
         System.out.println("");
       }

       /* Matrix B*/
       System.out.println("Enter the Value for Matrix B ");
	for(i=0;i<m;i++){
	 for(j=0;j<n;j++){
 		b[i][j] = obj.nextInt();
         }
       }
	System.out.println("--------Matrix B--------------\n ");
       for(i=0;i<m;i++){
	 for(j=0;j<n;j++){
 		System.out.print(" "+b[i][j]+" ");
         }
         System.out.println("");
       }	


 	System.out.println("-------Matrix A + Matrix B------\n ");
	for(i=0;i<m;i++){
	 for(j=0;j<n;j++){
 		c[i][j] = b[i][j]+a[i][j];
         }
       }
       for(i=0;i<m;i++){
	 for(j=0;j<n;j++){
 		System.out.print(" "+c[i][j]+" ");
         }
         System.out.println("");
       }	
  }
}
