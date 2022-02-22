import java.lang.Exception;
import java.util.Scanner;
class AgeLimitException extends Exception
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  int ag = sc.nextInt();
   try
   {
   age(ag);
   }
   catch(AgeLimitException e)
   {
    System.out.println("Invalid age");
   }

 }
 public static void age(int ag)throws AgeLimitException
 {
  if(ag >15){
  System.out.println("Valid age");
  }
  else{
  throw new AgeLimitException();
  }
 } 
}