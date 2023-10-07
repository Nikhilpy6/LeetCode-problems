class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        d={}
        for i in nums:
          if i%2==0:
            if i in d:
              d[i]+=1
            else:
              d[i]=1
        maxi=0
        ans=-1
        
        for i in d:
          if d[i]>maxi:
            maxi=d[i]
            ans = i
            
          if d[i]==maxi and i<ans:
            ans =i
            
            
        return ans;