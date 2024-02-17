class Reverse{
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int temp = x;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
public static void main(String args[])
{
Reverse r=new Reverse();
boolean a=r.isPalindrome(121);
System.out.print(a);
}
}