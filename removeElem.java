
class removeElem {
public int removeElement(int[] nums, int val) {
int index = 0;
int news[]=new int[10];
for (int i = 0; i < nums.length; i++) 
{
if (nums[i] != val) 
{
nums[index] = nums[i];
news[index]=nums[index];
index++;
}
}
for(int i:news)
{
System.out.print(i);
} 
return index;
}
public static void main(String args[])
{
removeElem r=new removeElem();
int nums[]={1,2,3,3,4,4,3,6};
int a=r.removeElement(nums,3);
System.out.println(" "+a);
}
}            