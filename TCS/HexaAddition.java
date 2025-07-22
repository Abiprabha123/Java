class Binary_Addition
{
public static void main(String[] args)
{
String a="1001";
String b="101";
String r="";
while(a.length()<b.length)
{
a="0"+a;
}
while(a.length()>b.length)
{
b="0"+b;
}
int c=0;
int s=0;
for(int i=a.length()-1;i>=0;i--)
{
int d1=a.charAt(i)-'0';
int d2=b.charAt(i)-'0';
s=d1+d2+c;
int rem=s%2;
c=s/2;
r=rem+r;
}
if(c>0)
{
r=c+r;
}
System.out.println(r);
}
}



class Octal_Addition
{
public static void main(String[] args)
{
String a="23";
String b="15";
String r="";
while(a.length()<b.length)
{
a="0"+a;
}
while(a.length()>b.length)
{
b="0"+b;
}
int c=0;
int s=0;
for(int i=a.length()-1;i>=0;i--)
{
int d1=a.charAt(i)-'0';
int d2=b.charAt(i)-'0';
s=d1+d2+c;
int rem=s%8;
c=s/8;
r=rem+r;
}
if(c>0)
{
r=c+r;
}
System.out.println(r);
}
}




class Hexadecimal_Addition
{
public static void main(String[] args)
{
String a="2A";
String b="1C";
String r="";
while(a.length()<b.length)
{
a="0"+a;
}
while(a.length()>b.length)
{
b="0"+b;
}
int c=0;
int s=0;
for(int i=a.length()-1;i>=0;i--)
{
int d1;
int d2;
if(a.charAt(i)>='0'&& a.charAt(i)<='9')
{
d1=a.charAt(i)-'0';
}
else
{
d1=a.charAt(i)-'A'+10;
}
if(b.charAt(i)>='0'&& b.charAt(i)<='9')
{
d2=b.charAt(i)-'0';
}
else
{
d2=b.charAt(i)-'A'+10;
}
s=d1+d2+c;
int rem=s%16;
c=s/16;
if(rem<10)
{
r=(char)('0'+rem)+r;
}
else
{
r=(char)('A'+(rem-10))+r;
}
}
if(c>0)
{
if(c<10)
{
r=(char)('0'+c)+r;
}
else
{
r=(char)('A'+(c-10))+r;
}
}
System.out.println(r);
}
}