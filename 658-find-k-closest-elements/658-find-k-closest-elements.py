class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
      answer=[]
      st=0
      end=len(arr)-1
      while end-st >=k:
        if abs(arr[st]-x) > abs(arr[end]-x):
          st+=1
        else:
          end-=1
      
      for i in range(st,end+1):
        answer.append(arr[i]);
      
      
      return answer;