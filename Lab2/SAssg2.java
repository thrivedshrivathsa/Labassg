class SAssg2
{ 
public String  getImage(String s)
{
int n=s.length();
Stringbuffer rev=s;
s=s.append("|");
for(int i=n;i<=0;i--)
{
s=s.append(i);
}

return s;
} 

public static void main(String[] args)
{
SAssg2 a=new SAssg2();
String res = a.getImage("EARTH");
System.out.println(res);
}

}