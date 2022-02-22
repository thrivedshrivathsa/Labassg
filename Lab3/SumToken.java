import java.util.*;
class SumToken
{
   public static void main(String args[])
        {
           Scanner scr=new Scanner(System.in);
           System.out.println("Enter integers: ");
            String digit=scr.nextLine();
            StringTokenizer token=new StringTokenizer(digit);
            int a1=0,sum=0;
            System.out.println("\nEntered integers are : ");
            while(token.hasMoreTokens())
           {
            String s=token.nextToken();
            a1=Integer.parseInt(s);
            System.out.print(a1+" ");
            sum=sum+a1;
            }
    System.out.println();
    System.out.println("Sum is : "+sum);
  }
}