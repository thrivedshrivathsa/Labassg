class Assg7
{
 public boolean checkNumber(int n)
{
boolean res=true;
do
{
res = (n%10>(n/10)%10) ? true:false;
if(res==false)
{
n=0;
}
else{
n=n/10;
}
}
while(n!=0);

return res;
}

public static void main(String[] args)
{
Assg7 a = new Assg7();
boolean result = a.checkNumber(1234565);
System.out.println(result);
}

}