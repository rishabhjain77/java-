import java.util.*;

class Matrix
{
void addMatrix(int a[][],int b[][],int m,int n)
{
int i,j;
int c[][]=new int[m][n];
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
 {
   c[i][j]=0;
   c[i][j]=a[i][j]+b[i][j];                      //Adding two matrix
  }
}
System.out.println("Addition is matrix is");
for(i=0;i<m;i++)                              //Displaying matrix
{
  for(j=0;j<n;j++)
  {
    System.out.print(c[i][j]+"");
   }
System.out.println("");
}
}
void mulMatrix(int a[][],int b[][],int m,int n,int p,int r)
{
int i,j,k;
int z[][]=new int[m][r];
if(n!=p)                        //condition check
{
System.out.println("Multiplication not possible");
}
else
{
for(i=0;i<m;i++)
 {
  for(j=0;j<r;j++)
    {
      z[i][j]=0;
    for(k=0;k<n;k++)
     {
     z[i][j]=a[i][k]*b[k][j];                     //muliplication
      }
    }
  }
}
 for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
     {
       System.out.print(z[i][j]+"");  //displaying matrix
      }
      System.out.println("");
    }
}


void transposeMatrix(int a[][],int m,int n)
{
int b[][]=new int[m][n];
int i,j;
for(i=0;i<n;i++)
{ 
  for(j=0;j<m;j++)
   { 
     b[i][j]=a[j][i];
    }
}
for(i=0;i<n;i++)
{ 
  for(j=0;j<m;j++)
   { 
     System.out.print(b[i][j]+"");
    }
System.out.println("");
}
}

public static void main(String args[])
{
int m,n,p,r,ch,i,j;
Matrix m1=new Matrix();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the rows and columns of matrix A");
m=sc.nextInt();
n=sc.nextInt();
int a[][]=new int[m][n]; //declaring array   
System.out.println("Enter the rows and columns of matrix B");
p=sc.nextInt();
r=sc.nextInt();
int b[][]=new int[p][r]; //declaring array 
do
{
System.out.println("Menu\n1.Addition\n2.Multiplication\n3.Transpose\n4.exit");
System.out.println("Enter a choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
{
System.out.println("Enter elements of A");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
   a[i][j]=sc.nextInt();
   }
}
System.out.println("Enter elements of B");
for(i=0;i<p;i++)
{
 for(j=0;j<r;j++)
  {
   b[i][j]=sc.nextInt();
   }
}
m1.addMatrix(a,b,m,n);
break;
}
case 2:
{
System.out.println("Enter elements of A");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
   a[i][j]=sc.nextInt();
   }
}
System.out.println("Enter elements of B");
for(i=0;i<p;i++)
{
 for(j=0;j<r;j++)
  {
   b[i][j]=sc.nextInt();
   }
}
m1.mulMatrix(a,b,m,n,p,r);
break;
}
case 3:
{
System.out.println("Enter elements of A");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
   a[i][j]=sc.nextInt();
   }
}
m1.transposeMatrix(a,m,n);
break;
}
case 4:break;
}
}while(ch!=4);
}
}

