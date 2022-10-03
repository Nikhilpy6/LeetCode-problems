class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        for i in range(1,len(nums)):
          nums[i]+=nums[i-1];
        for i in range(len(nums)):
          nums[i]=nums[i]%k
        
        d={0:-1}
        for i in range(len(nums)):
          if nums[i] not in d:
            d[nums[i]]=i
        for i in range(len(nums)):
          if i-d[nums[i]]>1:
            return True
        return False