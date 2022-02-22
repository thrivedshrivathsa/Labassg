import java.util.Scanner;

class Assg6
{

public int calculateDifference(int n)
{
int a1=0,a2=0;
for(int i=1;i<=n;i++)
{
a1=a1+(i*i);
}

for(int j=0;j<=n;j++)
{
a2=a2+j;
}
a2=a2*a2;

return a1-a2;
}

public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
Assg6 a1 = new Assg6();
int sum = a1.calculateDifference(scan.nextInt());
System.out.println(sum);

}

}