class Assg4
{

public void sample(int n)
{
boolean b=true;

for(int i=1;i<=n;i++)
{
  if(i<=3)
  {
  System.out.println(i);
  }
  else
  {
   for(int j=2;j<i;j++)
   {
   if(i%j==0)
   {
   b=false;
   j=i;
   }
   }
  }
  if(b==true)
  {
  System.out.println(i);
  }
}
}

public static void main (String[] args)
{
Assg4 a2 = new Assg4();
a2.sample(15);
}

}