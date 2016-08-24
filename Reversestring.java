import java.util.*;
class Reversestring
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 StringBuffer sb=new StringBuffer(s);
 sb.reverse();
 System.out.print(sb);
}
}