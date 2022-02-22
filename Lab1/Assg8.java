import java.util.Scanner;
class Assg8
{
public boolean checkNumber(int n)
{
int k=2;
do
{
k=2*k;
//res = (k==n) ? true:false;
}
while(k<n);
boolean res = (k==n) ? true:false;
return res;
}


public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Assg8 q = new Assg8();


boolean Result = q.checkNumber(sc.nextInt());
System.out.println(Result);
}
}