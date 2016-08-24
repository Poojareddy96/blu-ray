import java.util.*;
class Factorial
{
public static void main(String args[])
{
long i,n,fact=1;
Scanner sc=new Scanner(System.in);
n=sc.nextLong();
if(n>1)
{
for(i=1;i<n;i++)
{
 fact+=fact*i;
}
System.out.print(fact);
}
else
 System.out.print("0");
}
}