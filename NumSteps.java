import java.util.Scanner;
class NumSteps
{
public int Display()
{
int steps=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=sc.nextInt();
while(num>0)
{
if(num%2==0)
{
num/=2;
}
else
{
num--;
}
steps++;
}
return steps;
}

public static void main(String args[])
{
NumSteps n=new NumSteps();
int res=n.Display();
System.out.println("Steps: "+res);
}
}