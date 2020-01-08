#include <stdio.h>

int game(int* guess, int guessSize, int* answer, int answerSize){
  int count=0;
  for(int i=0;i<guessSize;i++)
    if(*(guess+i)==*(answer+i))count++;
  return count;
}

int main()
{
  int a[] = {1,2,3} , b[] = {1,2,3};
  int count = game(a,3,b,3);
  printf("结果是%d\n",count);
  return 0;
}
