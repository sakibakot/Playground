#include<stdio.h>
int main()
{
  //Type your code here
  unsigned int y;
  scanf("%d",&y);
  if(y%4!=0)
    printf("Not Leap year");
  else 
    printf("Leap year");
  return 0;
}