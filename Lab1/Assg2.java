class TraffiLight
{
public void test(String ligth)
{
String k=ligth;
switch(k){
case "red":
System.out.println("stop");
break;
case "yellow":
System.out.println("ready");
break;
case "green":
System.out.println("go");
break;
}
}
}
class Assg2
{
public static void main(String[] args)
{
TraffiLight t1=new TraffiLight();
 
t1.test("green");
}
}
