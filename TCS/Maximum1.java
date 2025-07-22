import java.util.*;
public class Maximum1 {
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int row = in.nextInt();
int col = in.nextInt();
int[][] arr = new int[row][col];
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++) 
{
arr[i][j] = in.nextInt();
}
}
int max = -1; 
int ro=-1;                
for(int i=0;i<row;i++)
{
int count = 0;
for(int j=0;j<col;j++) if(arr[i][j] == 1)
{
 count++;
}
if(count > max) 
{
max = count;
ro=i;
}
}
if(row!=-1)
{
System.out.println(ro+1);
}
else
{
System.out.println("no");
}
}
}
