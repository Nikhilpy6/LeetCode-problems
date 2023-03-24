class Solution:
    def numBusesToDestination(self, routes: List[List[int]], s: int, target: int) -> int:
        if(s==target):
            return 0
        stopvis={}
        nodevis={}
        adj={}
        for i in range(len(routes)):
            for j in routes[i]:
                if j not in adj:
                    adj[j]=[i]
                else:
                    adj[j].append(i)

        res=0
        stopvis[s]=1
        tempq=[s]
        q=[s]
       
        while tempq:
            res+=1
            q=tempq.copy()
            tempq=[]
            while q:
                x=q.pop(0)
                l=adj[x]
                for y in l:
                    if y not in nodevis:
                        nodevis[y]=1
                        for stop in routes[y]:
                            if stop not in stopvis:
                                stopvis[stop]=1
                                if(stop==target):
                                    return res
                                else:
                                    tempq.append(stop)
        return -1
