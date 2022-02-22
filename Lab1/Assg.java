class SumCubes{
public int test(int n)
{
int k=0,cube=0,sum=0;
do
{
k=n%10;
cube=k*k*k;
sum=sum+cube;
n=n/10;
}
while(n!=0);
return sum;
}
}

class Assg{
public static void main(String[] args)
{
SumCubes s1=new SumCubes();
int res=s1.test(12345);
System.out.println(res);


}
}