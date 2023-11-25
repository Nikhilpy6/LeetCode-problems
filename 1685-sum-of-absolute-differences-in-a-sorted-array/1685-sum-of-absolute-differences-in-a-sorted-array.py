class Solution:
    def getSumAbsoluteDifferences(self, nums: List[int]) -> List[int]:
        ps=[]
        s=0;
        ans=[]
        n=len(nums)
        for i in range(len(nums)):
          s+=nums[i]
          ps.append(s)
          
        for i in range(len(nums)):
          if i==0:
            l=0
            r=(ps[-1]-ps[i])-(nums[i]*(n-i-1))
            #ans.append(l-r)
            
          elif i==n-1:
            r=0
            l=nums[i]*i-(ps[i-1])
            #ans.append(abs(l-r))
            
          else:
            l=nums[i]*i-(ps[i-1])
            r=(ps[-1]-ps[i])-(nums[i]*(n-i-1))
            
          ans.append(l+r)
          
          
        return ans
          
          
          
          
          
          
          
          