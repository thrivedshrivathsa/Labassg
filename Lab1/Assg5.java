import java.util.Scanner;

class Assg5
{

public static int calculateSum(int n)
{
int sum=0;

for(int i=1;i<=n;i++)
{
if(i%3==0 || i%5==0)
{
sum=sum+i;
}
}
return sum;

}

public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int sum = calculateSum(scan.nextInt());
System.out.println(sum);
}

}