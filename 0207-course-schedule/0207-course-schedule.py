class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        n=numCourses
        adj=[[] for i in range(n)]
        deg=[0]*n
        for x,y in prerequisites:
            adj[y].append(x)
            deg[x]+=1
        q=[]
        for i in range(n):
            if deg[i]==0:
                q.append(i)
        c=0
        while(q):
            c+=1
            x=q.pop(0)
            l=adj[x]
            for y in l:
                deg[y]-=1
                if deg[y]==0:
                    q.append(y)        
        if(c==n):
            return True
        else:
            return False