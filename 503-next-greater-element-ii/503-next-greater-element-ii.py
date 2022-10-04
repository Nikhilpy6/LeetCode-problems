class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
      n=len(nums)
      res=[-1]*n
      nums=nums*2  
      st=[-1]
      for i in range(2*n):
        while st and nums[st[-1]]<nums[i]:
          if res[st[-1]%n]==-1:
            res[st[-1]%n]=nums[i]
          st.pop()
        st.append(i)
      return res
        