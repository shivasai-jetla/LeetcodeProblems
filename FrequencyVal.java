import java.util.*;
class FrequencyVal
{
static int j=0;
public static int[] frequent(int nums[])
{
ArrayList<Integer> arr = new ArrayList<>();
int k=0;
for(int i=1;i<nums.length;i+=2)
{
     for(int n=0;n<nums[k];n++)
     {
           arr.add(nums[i]);
           j++;
      }
      k+=2;
}
int[] res=new int[j];
for(int i=0;i<arr.size();i++)
{
res[i]=arr.get(i);
}
return res;
}
public static void main(String arg[])
{
int nums[]= {4,2,4,4};
int[] result=new int[j];
result=frequent(nums);
for(int i: result)
{
 System.out.print(i  +" ");
}
}
}