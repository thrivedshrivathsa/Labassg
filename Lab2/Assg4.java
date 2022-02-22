class Assg4
{
static int k=0;
public int[] modifyArray(int[] nums)
{
boolean sa = true;
int[] arr = new int[nums.length];
for(int i=0;i<nums.length;i++)
{
  for(int j=i+1;j<nums.length;j++)
  {
    if(nums[i]==nums[j])
    {
    sa=false;
    arr[i]=0;
    j=nums.length;
    }
    else
    {
    sa = true;
    }
  }
  if(sa == true)
  {
  arr[k]=nums[i];
  k++;
  }
}
return arr;
}

public static void main(String[] args)
{
Assg4 a = new Assg4();
int[] input = {12,34,56,87,87,54,12}; 
int[] res = a.modifyArray(input);
  for(int i=0;i<k;i++)
  {
  System.out.println(res[i]);
  }
}

}