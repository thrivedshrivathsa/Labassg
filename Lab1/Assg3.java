class Assg3
{
public int fibonacci(int n)
{
if(n==1 || n==0)
{
return n;
}
else
{
return fibonacci(n-1)+fibonacci(n-2);
}
}

public static void main (String[] args)
{
Assg3 a = new Assg3();
int res = a.fibonacci(2);
System.out.println(res);
}

}