class GuestEntry
{
public static void main(String[] args)
{
int Entry[]={7,0,5,1,3};
int Exit[]={1,2,1,3,4};
int sum=0;
int max=0;
for(int i=0;i<Entry.length;i++)
{
sum=sum+Entry[i]-Exit[i];
if(max<sum)
{
max=sum;
}
}
System.out.println(max);
}
}
