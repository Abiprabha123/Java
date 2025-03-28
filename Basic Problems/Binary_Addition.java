class Binary_Addition{
public static void main(String[] args){
String a="1010";
String b="0010";
while (a.length()<b.length()){
 a='0'+a;
}
while (a.length()>b.length()){
 b='0'+b;
}
int carry=0;
String result="";
for(int i=a.length()-1;i>=0;i--){
int digit1;
int digit2;
digit1=a.charAt(i)-'0';
digit2=b.charAt(i)-'0';
int sum=digit1+digit2+carry;
int  remainder=sum%10;
carry=sum/10;
result=remainder+result;
}
if (carry>0){
result=carry+result;
}
System.out.print(result);
}
}



