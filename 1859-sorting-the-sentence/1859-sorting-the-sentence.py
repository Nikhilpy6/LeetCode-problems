class Solution:
    def sortSentence(self, s: str) -> str:
      words = s.split()
      n=len(words)
      res=[None]*n
      for i in range(len(words)):
        #res[int(li[i][-1]) - 1] = li[i][:-1]
        #print(a)
        res[int(words[i][-1]) - 1] = words[i][:-1]
      return " ".join(res)