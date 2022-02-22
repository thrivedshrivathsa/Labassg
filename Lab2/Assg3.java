import java.util.Arrays;
class Assg3
{
  public int[] getSorted(int[] nums)
  {
   int[] re = new int[nums.length];
   for(int i=0;i<nums.length;i++)
   {
    re[i]=nums[nums.length-1-i];
   }
  Arrays.sort(re);
  return re;
  }

  public static void main(String[] args)
  {
   Assg3 a=new Assg3();
   int[] input={23,44,22,14,54,76};
   int[] res=a.getSorted(input);
   for(int i=0;i<res.length;i++)
   {
   System.out.println(res[i]);
   }
  }
}