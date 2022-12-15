class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        n=numCourses
        adj=[[] for i in range(n)]
        deg=[0]*n
        res=[]
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
            res.append(x)
            l=adj[x]
            for y in l:
                deg[y]-=1
                if deg[y]==0:
                    q.append(y)  
        if(len(res)==n):      
            return res
        else: 
            return ([])