//code with For Loop

class CustomerMax
{
int BankData[][]={{1,2,3},{2,3,4},{1,3,2}};
int Test()
{
int res=0;
for(int i=0 ;i<BankData.length;i++)
{
int temp=0;
for(int j=0 ;j<BankData[i].length;j++)
{
temp+=BankData[i][j];
}
res =Math.max(res,temp);
}
return res;
}
public static void main(String args[])
{
CustomerMax c=new CustomerMax();
int result=c.Test();
System.out.println(result);
}
}