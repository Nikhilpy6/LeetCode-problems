class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # c=0
        # a=0
        # for i in nums:
        #   if c==0:
        #     a=i
        #   if a==i:
        #     c+=1
        #   else:
        #     c-=1
        # return a
        
        if(len(nums)==1):
          return nums[0]
        d={}
        for  i in nums:
          if i in d and d[i]==len(nums)//2:
            return i
          if i in d:
            d[i]+=1
          else:
            d[i]=1
            