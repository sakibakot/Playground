#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,m,count=0,num=0,rem,q;
  scanf("%d",&n);
  m=n;
  q=n;
  while(n>0)
  {count++;
   n/=10;
  }
  while(m>0)
  {rem=m%10;
   num=num+pow(rem,count);
  m/=10;
  }
  if(num==q)
  printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}