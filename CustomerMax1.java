class CustomerMax1
{
int BankData[][]={{1,2,3},{2,3,4},{1,3,2}};
int Test()
{
int res=0;
for(int i[]:BankData)
{
int temp=0;
for(int j:i)
{
temp+= j;
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