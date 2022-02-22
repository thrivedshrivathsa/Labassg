import java.util.Scanner;
import java.lang.Exception;
class FullNameException extends Exception
{
  public static void main(String[] args)
  {
   FullNameException a = new FullNameException();
   Scanner sc = new Scanner(System.in);
   String s1 = sc.next(); 
   String s2 = sc.next(); 
    try{
    a.fullName(s1,s2);
    }
    catch(FullNameException e){
    System.out.println("Enter Full Name");
    }
   
  }
  public  void fullName(String first,String last)throws FullNameException
  {
   if(first.equals(".	1") || last.equals("."))
   {
     throw new FullNameException();
   }
   else
   {
    System.out.println("Full Name:"+first+" "+last);
   }
  } 
}