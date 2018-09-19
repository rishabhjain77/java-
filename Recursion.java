import java.util.*;

class Recursion
{
//method to find gcd
int gcd(int n1,int n2)
{
if(n2!=0)
{
return gcd(n1,n2%n1);
}
else
return n1;
}
//method to find Power x^y
int power(int x,int y)
{
if(y==1)
{
return x;
}
else
{
return x*power(x,y-1); //power reduces by 1 for every call
}
}
//Fibonacci series
int fibo(int n)
{
if(n==0)
return 0;
else if(n==1)
return 1;
else
return (fibo(n-1)+fibo(n-2));  //Adds current and previous numbers
}
//Sum of series
int sum(int m)
{
if(m==1)
return 1;
else
return (m+sum(m-1));
}
//Reverse of a number
void reverse(int k)
{
if (k<10)
 {
  System.out.println(k);  //prints the last digit
 }
else
 {
   System.out.print(k%10); //prints the remainder 
   reverse(k/10);
 }
}
public static void main(String args[])
{
int n1,n2,n,k,m,ch,g,l,x,y,i,s,p;
Scanner sc=new Scanner(System.in);
Recursion r1=new Recursion();
do
{
System.out.println("1.GCD and LCM\n2.Power\n3.Fibonacci\n4.Summation\n5.Reverse\n6.Exit");
System.out.println("Enter choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
{
System.out.println("Enter n1 and n2");
n1=sc.nextInt();
n2=sc.nextInt();
g=r1.gcd(n1,n2);
l=(n1*n2)/g;
System.out.println("Gcd is::"+g+" "+"Lcm is::"+l);
break;
}
case 2:
{
System.out.println("Enter x(number) and y(power)");
x=sc.nextInt();
y=sc.nextInt();
p=r1.power(x,y);
System.out.println("Answer is:"+p);
break;
}
case 3:
{
System.out.println("Enter limit");
n=sc.nextInt();
for(i=0;i<n;i++)
{
System.out.print(r1.fibo(i)+" ");
}
break;
}
case 4:
{
System.out.println("Enter limit of series");
m=sc.nextInt();
s=r1.sum(m);
System.out.println("Sum is:"+s);
break;
}
case 5:
{
System.out.println("Enter number to reverse:");
k=sc.nextInt();
System.out.println("Reverse of the number is:");
r1.reverse(k);
break;
}
case 6:break;
}
}while(ch!=6);
}
}