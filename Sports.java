import java.util.*;

class Sports 
{
    int score,sid;
    String item;
    public Sports(int score,int sid,String item)
    {
        
        this.score=score;
        this.item=item;
    }
    
}



class Student extends Sports
{
    int acscore,sid;
    String sub;
    
    
    public Student(int acscore,int sid,String sub,int score,String item)
    
    {
        
        super(score,sid,item);
        
        this.acscore=acscore;
        this.sid=sid;
        this.sub=sub;
    }
    
    
    
}




class Result extends Student
{
    Scanner sc = new Scanner(System.in);
   // int search;
    public Result(int acscore,int sid,String sub,int score,String item)
     {
         super(acscore,sid,sub,score,item);
     }
    

}


class Main 

{
    
    public static void main(String ar[])
    
    {    Scanner sc = new Scanner(System.in);

         int search;
         Result[] obj=new Result[5];
         obj[0]=new Result(50,1,"NSA",54,"RUNNING");
         obj[1]=new Result(50,2,"NSA",44,"WALK");
         obj[2]=new Result(50,3,"NSA",84,"JUMP"); 
         obj[3]=new Result(50,4,"NSA",51,"SWIM");
         obj[4]=new Result(50,5,"NSA",50,"RUNNING");
         //obj[5]=new Result();
         
        // obj[0].display();


     
  
       System.out.println("ENTER THE STUDENT NUMBER");
       search=sc.nextInt();
       
       for(int i=0;i<5;i++)
       {
           if(obj[i].sid==search)
           {
               System.out.println("DETAILS...");
               System.out.println(obj[i].acscore);
               System.out.println(obj[i].sid);
               System.out.println(obj[i].sub);
               System.out.println(obj[i].score);
               System.out.println(obj[i].item);
//               System.out.println(obj[i].acscore)

           }
           
           
       }
      
  

  


         
    }
}











