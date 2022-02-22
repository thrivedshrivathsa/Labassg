class Test
{

public int calculateSum(int n)
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
}

class Assg5b{

public static void main(String[] args)
{
Test t1 = new Test();
int sum1 = t1.calculateSum(10);
System.out.println(sum1);
}

}