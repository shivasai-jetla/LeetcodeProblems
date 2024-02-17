class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
public static void main(String args[])
{
Solution s=new Solution();
int a[]={2,3,5,6};
int result[]=s.twoSum(a, 8);
for(int i:result)
{
System.out.print(i +" ");
}
}
}