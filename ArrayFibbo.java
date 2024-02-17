class ArrayFibbo
{
public int[] runningSum(int nums[])
{
//int nums[]={2,3,4,5};
for(int i=1;i<nums.length;i++)
{
nums[i]=nums[i-1]+nums[i];
}
return nums;
}
public static void main(String args[])
{
ArrayFibbo a=new ArrayFibbo();
int nums[]={2,3,4,5};
int[] res=a.runningSum(nums);
for(int i:res)
{
System.out.print(" "+i+" ");
}
}
}