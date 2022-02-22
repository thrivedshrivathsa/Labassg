class Assg1
{
public int getSecondSmallest(int[] nums)
{
int s1=nums[0],s2=nums[0];

for(int i=1;i<nums.length;i++)
{
s1 = s1<nums[i] ? s1:nums[i];
}
for(int i=1;i<nums.length;i++)
{
//s2 = (s2>s1 && s2<nums[i])? s2:nums[i];
if(s1>nums[i])
{
s1 = s2<nums[i] ? s2:nums[i];
}
}
return s2;
}

public static void main(String[] args)
{
Assg1 a1 = new Assg1();
int[] sample = {5,5,43,7,66,3,4,8};
int res = a1.getSecondSmallest(sample);
System.out.println(res);
}

}