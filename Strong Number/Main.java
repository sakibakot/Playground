#include <stdio.h>
int fact(int p);
int main()
{ int n,sum=0,m,rem;
  scanf("%d",&n);
 m=n;
  //Type your code
  while(n>0)
  {
    rem=n%10;
    sum=sum+fact(rem);
    n/=10;
  }
 if(sum==m)
   printf("Yes");
 else 
   printf("No");
	return 0;
}

int fact(int x)
{int r;
  if (x<=1)
  return 1;
 else
 {
   r=x*fact(x-1);
 return r;
}
}