class Balloon
{
public static void main(String[] args)
{
char arr[]={'r','g','b','b','g','y','y'};
for(int i=0;i<arr.length;i++)
{
int count=0;
for(int j=0;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
count++;
}
}
if(count%2!=0)
{
System.out.println(arr[i]);
return;
}
}

System.out.println("No");
}
}


