import java.util.Scanner;

public class StringPipe
{
       String s;
       public String getImage(String str)
       {
              StringBuffer s1 = new StringBuffer(str);
              s1.append('|');
              StringBuffer s2 = new StringBuffer(str);
              s2.reverse();
              s1.append(s2);
              s = s1.toString();
              return s;
       }
       public static void main(String[] ar)
       {
              StringPipe p = new StringPipe();
              Scanner sca = new Scanner(System.in);
              System.out.println("Enter a String");
              String str = sca.next();
              System.out.println(p.getImage(str));
       }
}