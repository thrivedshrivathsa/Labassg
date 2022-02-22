import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
class E1
{
public List getValues(HashMap<Integer,String> h1)
{
  List<String> l1 = new LinkedList(h1.values());
  Collections.sort(l1);
  return l1; 
}
public static void main(String args[])
{
 HashMap<Integer,String> h = new HashMap<>();
 h.put(110,"abcd");
 h.put(120,"abcdc");
 h.put(130,"abdc");
 h.put(140,"aded");
 h.put(1150,"aeiou");

 E1 e = new E1();

 List l = e.getValues(h);
 System.out.println(l);
}
}