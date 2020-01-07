#include <stdio.h>

int subtractProductAndSum(int n){
  if(n<=0)return 0;

  int m=n,a=1,b=0;
  while(m>0)
  {
    int i = m%10;
    printf("此时i:%d和m:%d\n",i,m);
    a*=i;
    b+=i;
    m/=10;
  }
  return a-b;
}

int main()
{
  int n;
  printf("请输入数字：");
  scanf("%d\n",&n);
  int m = subtractProductAndSum(n);
  printf("结果是%d\n",m);
}
