import java.util.Scanner;
import java.lang.Exception;
class EmployeeException extends Exception
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
EmployeeException s =new EmployeeException();
int sal = sc.nextInt();
try
{
s.salary(sal);
}
catch(EmployeeException e){
System.out.println("Salary is less");
}
}
public void salary(int sal)throws EmployeeException
{
if(sal<3000)
{
throw new EmployeeException();
}
else
{
System.out.println("Salary");
}
}
}