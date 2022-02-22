class Assg2
{
public String[] sortString(String[] arr)
{
String[] newarr = new String[arr.length];
int n=arr.length/2;
for(int i=0;i<=n;i++)
{
newarr[i]=arr[i].toUpperCase();
}
for(int j=n+1;j<arr.length;j++)
{
newarr[j]=arr[j].toLowerCase();
}
System.out.println(newarr);
return newarr;
}

public static void main(String[] args)
{
Assg2 a=new Assg2();
String[] sarr = {"dfdf","dfhh","vfvd","yuu","ioio"};
String[] re = a.sortString(sarr);
for(int i=0;i<re.length;i++)
{
System.out.println(re[i]);
}
}

}