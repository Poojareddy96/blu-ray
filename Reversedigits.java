import java.util.*;
class Reversedigits
{
public static void main(String args[])
{
long n;
Scanner sc=new Scanner(System.in);
n=sc.nextLong();
Reversedigits r=new Reversedigits();
System.out.print(r.fun(n));
}
public long fun(long n)
{
long rev=0;
while(n>0)
{
 long a=n%10;
 rev=(rev*10)+a;
 n=n/10;
}
return(rev);
}
}
