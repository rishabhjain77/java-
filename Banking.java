import java.util.*;


class Banking
{
String accno;
String name;
double balance;
Scanner sc=new Scanner(System.in);
// method to create an account
void createAccount()
{
System.out.println("Enter the Account number");
accno=sc.next();
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter balance");
balance=sc.nextDouble();
}
// method to Deposit money
void deposit()
{
double amt;
System.out.println("Enter the amount to deposit:");
amt=sc.nextDouble(); 
balance=balance+amt;
}
//method to Withdraw money
void withdraw()
{
double amt;
System.out.println("Enter the amount to withdraw");
amt=sc.nextDouble();
if(balance>=amt)
{
balance=balance-amt;
}
else
{
System.out.println("Insuffient balance");
}
}
//method to calculate interest
void computeinterest()
{
double ci;
double rate=5.0d,t=1.0d;
System.out.println("Interest at 5% yearly is :");
ci=balance*Math.pow((1+rate/100),t);
System.out.println(ci);
}
//Display account details
void showaccount()
{
System.out.println("Account no:"+accno+"\nName:"+name+"\nBalance:"+balance);
}
public static void main(String args[])
{
int ch;
Scanner sc=new Scanner(System.in);
Banking b=new Banking();
do
{
System.out.println("Menu\n1.CreateAccount\n2.Deposit\n3.Withdraw\n4.Interest\n5.Display\n6.Exit");
System.out.println("Enter choice");
ch=sc.nextInt();
switch(ch)
{
case 1:b.createAccount();
break;
case 2:b.deposit();
break;
case 3:b.withdraw();
break;
case 4:b.computeinterest();
break;
case 5:b.showaccount();
break;
case 6:break;
}
}while(ch!=6);
}
}