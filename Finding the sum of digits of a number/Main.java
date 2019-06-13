#include <stdio.h>
int main() {
	//Type your code
  int n,sum;
  scanf("%d",&n);
  while(n>0)
  {
    sum=sum+(n%10);
    n/=10;
  }
  printf("%d",sum);
	return 0;
}