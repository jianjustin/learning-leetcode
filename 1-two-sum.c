#include <stdio.h>
#include <stdlib.h>

int* twoSum(int* nums,int numsSize,int target,int* returnSize);

int main()
{
  int nums[4] = {2,7,11,15},nums1[2],target=9;
  int *p=nums1,*returnSize=(int *)malloc(sizeof(int) * 1);
  p = twoSum(nums,4,target,returnSize);
  if(*returnSize > 0)
    printf("两个数分别是%d和%d",*p,*(p+1));
  else
    printf("未获取得到结果");
}

int* twoSum(int* nums, int numsSize, int target, int* returnSize){
  int* p;
  for(int i=0;i<numsSize-2;i++) 
  {
    for(int j=i+1;j<numsSize-1;j++)
    {
      if(nums[i]+nums[j] == target)
      {
        p = (int*)malloc(sizeof(int) * 2);
        *returnSize = 2;
        p[0] = i;
        p[1] = j;
        return p;
      }
    }
  }
  *returnSize = 0;
  printf("即将返回的值分别是%d和%d\n",returnSize[0],returnSize[1]);
  return p;  
}
