#include <stdio.h>
int main() {
	//Type your code
  int n,m,c,l,f,p;
  scanf("%d",&n);
  m=n;
  p=n;
  while(n>0)
  {c++;
   n/=10;
  }
  c--;
  l=m%10;
  f=p/(pow(10,c));
  printf("%d",f+l);
    
	return 0;
}