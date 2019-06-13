 #include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int n,c=0,m,a,den;
  scanf("%d",&n);
  m=n;
  while(n>0)
  {
    c+=1;
    n/=10;
  }
  c--;
  den=pow(10,c);
    m=m%den;
 den/=10;
  a=m/den;
  printf("%d",a);
}
  
	
