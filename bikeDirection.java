class BikeDirection
{
public static int Bike(int[] nums)
{
	int count=0;
	for(int i=0;i<nums.length;i++)
	{
     		if(nums[i] == 0)
         		{ 
            			 for(int j=i+1;j<nums.length;j++)
              			 { 
                 		 	if(nums[j] == 1)
                       			{
                          			 count++;
                       			}
               			 }
		}		
	}
return count;
}
public static void main(String arg[])
{
	int[] nums= {0, 1, 0, 1, 1,1};
	int result= Bike(nums);
	System.out.print(result);
}
}