import java.util.*;
class Book
{
    int isbn,pid;
    String bname;
    
    public Book(int isbn,int pid,String bname)
    {
        this.isbn=isbn;
        this.bname=bname;
        this.pid=pid;
    }
    
}




class Publisher extends Book
{
  //  int pid;
    String pname;
    int category;
    //0:fic,/:lit
    public  Publisher(int pid,String pname,int category,int isbn,String bname)
    {
        super(isbn,pid,bname);
        this.pname=pname;
        this.category=category;
    }
    
}





//main
class Main
{
    public static void main(String ar[])
    {
        
        Scanner sc = new Scanner(System.in);
        int ch;
        Publisher[] obj=new Publisher[5];
        obj[0]=new Publisher(1,"MK",0,1540,"NSA");
        obj[1]=new Publisher(2,"OK",1,6540,"DSA");
        obj[2]=new Publisher(3,"EK",0,7540,"ESA");
        obj[3]=new Publisher(4,"JK",1,1580,"NHSA");
        obj[4]=new Publisher(5,"NK",0,8540,"PSOA");
        System.out.println("ENTER THE CHOICE(0/1)");
                ch = sc.nextInt();

        for (int i=0;i<5;i++)
        {
            if(ch==0)
            {
                if(obj[i].category==0)
                {
                System.out.println("BOOKS UNDER CATEGORY FICTION ARE: ");
                 System.out.println(obj[i].bname);
                }

            }
            else if(ch==1)
            {
                if(obj[i].category==1)
                {
                System.out.println("BOOKS UNDER THE CATEGORY LITERATURE ARE:");
                System.out.println(obj[i].bname);
                }
            }
            else
            {
                System.out.println("INVALID");
                System.exit(0);
            }
            
        }

    }
    
    
}
