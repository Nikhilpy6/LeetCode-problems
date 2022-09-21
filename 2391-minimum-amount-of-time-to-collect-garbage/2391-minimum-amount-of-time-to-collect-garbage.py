class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        ps=[]
        ps.append(0)
        g=0
        p=0
        m=0
        goc=0
        for i in range(len(travel)):
          ps.append(travel[i]+ps[i])
        for i in range(len(garbage)):
          for j in range(len(garbage[i])):
            goc+=1   # count the total garbage
            if garbage[i][j]=='G':
              g=i    #find the last position of glass garbage
            if garbage[i][j]=='P':
              p=i    #find the last position of glass paper
            if garbage[i][j]=='M':
              m=i    #find the last position of glass metal
        time=ps[m]+ps[g]+ps[p]+goc
        return time