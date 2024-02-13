import java.util.*;
class job
{
int p; 
int d; 
int v; 
job()
{
p=0;
d=0;
v=0;
}
job(int x,int y,int z) 
{
p=x;
d=y;
v=z;
}
}
class js
{
static int n;
static int out(job jb[],int x)
{
for(int i=0;i<n;++i)if(job[i].p==x)
return i;
return 0;
}
public static void main(String args[])
{
Scanner scr=new Scanner(System.in);
System.out.println("Enter the number of jobs");
n=scr.nextInt();
int max=0; 
job jb[]=new job[n];
for(int i=0;i<n;++i)
{
System.out.println("Enter profit and deadline(p d)");
int p=scr.nextInt();
int d=scr.nextInt();
if(max<d)
max=d; 
jb[i]=new job(p,d,0); 
}
for(int i=0;i<=n-2;++i)
{
for(int j=i;j<=n-1;++j)
{
if(jb[i].d>jb[j].d)
{
job temp=jb[i];
jb[i]=jb[j];
jb[j]=temp;
}
}
}

System.out.println("The jobs are as follows ");
for(int i=0;i<n;++i)
System.out.println("Job "+i+" Profit = "+jb[i].p+" Deadline = "+jb[i].d);
int count;
int hold[]=new int[max];
for(int i=0;i<max;++i)
hold[i]=0;
for(int i=0;i<n;++i)
{
count=0;
for(int j=0;j<n;++j)
{
if(count<jb[j].d && jb[j].v==0 && count<max && jb[j].p>hold[count])
{
int ch=0;
if(hold[count]!=0)
{
ch=out(jb,hold[count]);
jb[ch].v=0;
}
hold[count]=jb[j].p;
jb[j].v=1;
++count;
}
}
}
int profit=0;
for(int 
i=0;i<max;++i)
profit+=hold[i];
System.out.println("The maximum profit is "+profit);
}
}