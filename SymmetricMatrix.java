import java.util.Scanner;
class SymmetricMatrix{
  public static void main(String args[]){
  	int i,j;
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int s=0;
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

       for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            b[i][j] = a[j][i];
        }
       }
       System.out.println("--------Transpose-------------- ");
       for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            System.out.print(" "+b[i][j]+" ");
            }
            System.out.println("");
          }
       for(i=0;i<m;i++){
        for(j=0;j<n;j++){
                if(a[i][j]==b[i][j]){
                    s=1;
                }
                else{
                    s=0;
                    break;
                }
            }
           }
           if(s==1)
           System.out.println("Matrix is Symmetric");
           else
           System.out.println("Matrix is Not Symmetric");
  }
}