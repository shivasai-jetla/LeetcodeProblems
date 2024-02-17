class removeDupli {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
 public static void main(String args[])
{
removeDupli r=new removeDupli();
int nums[]={1,1,2};
int b=r.removeDuplicates(nums);
System.out.println(b);
}
}