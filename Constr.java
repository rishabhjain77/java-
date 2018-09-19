import java.util.*;
class Constr
{
int m;
String n;
Constr(int roll,String name)
{
m=roll;
n=name;
display(m,n);
}
Constr()
{
System.out.println("This is default Constructor");
System.out.println("Enter roll number and name");
Scanner sc1=new Scanner(System.in);
m=sc1.nextInt();
n=sc1.next();
display1(m,n);
}
void display(int m,String n)
{
System.out.println("Your roll no is::"+m+"and name is::"+n);
}
void display1(int m,String n)
{
System.out.println("Your roll no is::"+m+"and name is::"+n);
}
public static void main(String args[])
{
int roll,ch;
String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter choice 1.Default constructor\n2.Parameterized Constructor");
ch=sc.nextInt();
if(ch==1)
{
Constr cs=new Constr();//default constructor call
}
else
{
System.out.println("Enter roll number and name");
roll=sc.nextInt();
name=sc.next();
Constr cs1=new Constr(roll,name);//parameterized call
}
}
}

