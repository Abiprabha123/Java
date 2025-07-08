import  java.util.*;
class Chess {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n=in.nextInt();
int arr[][]=new int[n][n];
int bx=in.nextInt();
int by=in.nextInt();
int qx=in.nextInt();
int qy=in.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==bx&&j==by)
{
System.out.print("B");
}
else if(i==qx&&j==qy)
{
System.out.print("Q");
}

else if(((i==bx+1&&j==by+1)||(i==bx+2&&j==by+2)||(i==bx+3&&j==by+3)||(i==bx-1&&j==by-1)||(i==bx-2&&j==by-2)||(i==bx+1&&j==by-1)||(i==bx-1&&j==by+1)||(i==bx+2&&j==by-2)||(i==bx-2&&j==by+2))&&((i==qx+1&&j==qy+1)||(i==qx+2&&j==qy+2)||(i==qx+3&&j==qy+3)||(i==qx-1&&j==qy-1)||(i==qx-2&&j==qy-2)||(i==qx+1&&j==qy-1)||(i==qx-1&&j==qy+1)||(i==qx+2&&j==qy-2)||(i==qx-2&&j==qy+2)||i==qx||j==qy))
{
System.out.print("%");
}
else if((i==bx+1&&j==by+1)||(i==bx+2&&j==by+2)||(i==bx+3&&j==by+3)||(i==bx-1&&j==by-1)||(i==bx-2&&j==by-2)||(i==bx+1&&j==by-1)||(i==bx-1&&j==by+1)||(i==bx+2&&j==by-2)||(i==bx-2&&j==by+2))
{
System.out.print("*");
}
else if((i==qx+1&&j==qy+1)||(i==qx+2&&j==qy+2)||(i==qx+3&&j==qy+3)||(i==qx-1&&j==qy-1)||(i==qx-2&&j==qy-2)||(i==qx+1&&j==qy-1)||(i==qx-1&&j==qy+1)||(i==qx+2&&j==qy-2)||(i==qx-2&&j==qy+2)||i==qx||j==qy)
{
System.out.print("&");
}
else
{
System.out.print(".");
}
}
System.out.println();
}
}
}







