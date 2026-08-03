public static int palindrome(Int x){
  int o=x;
if(x<0) return false;
int rev=0;
while(x !=0){
  int d=x%10;
  rev=rev*10+d;
  x=x/10;
}
return x==0;
}
