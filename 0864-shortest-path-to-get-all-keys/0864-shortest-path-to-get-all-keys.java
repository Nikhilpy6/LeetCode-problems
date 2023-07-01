class Solution {
    public int bfs(String[] grid,HashMap<Character,Integer> keys,int sRow,int sCol,int k)
    {
        int n = grid.length;
        int m = grid[0].length();
        int[][] moves = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

        HashSet<String> vis = new HashSet<>();
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sRow,sCol,0});
        int steps = 0;
        vis.add(sRow+"-"+sCol+"-"+0);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            while(size-->0)
            {
                int[] curr = queue.poll();
                int row = curr[0];
                int col = curr[1];
                int mask = curr[2];

                if(mask == (1<<k)-1) //all keys are there
                {
                    return steps;
                }

                for(int i=0;i<moves.length;i++)
                {
                    int newRow = row+moves[i][0];
                    int newCol = col+moves[i][1];
                    
                    if(newRow >= n || newRow < 0 || newCol >= m || newCol < 0) continue;
                    int thisMin = Integer.MAX_VALUE;

                    char ch = grid[newRow].charAt(newCol);
                    
                    if(ch=='.' || ch=='@')
                    {
                        //simply allow it
                        String v = newRow+"-"+newCol+"-"+mask;
                        if(vis.contains(v) == false)
                        {
                            vis.add(v);
                            queue.offer(new int[]{newRow,newCol,mask});
                        }
                    }
                    else if(ch>='A' && ch<='Z')
                    {
                        //check if its corresponding key is there in mask if it is then allow it
                        int key = keys.get(Character.toLowerCase(ch));
                        if((mask & (1<<key)) != 0) //then this key is there
                        // with us so we can move
                        {
                            String v = newRow+"-"+newCol+"-"+mask;
                            if(vis.contains(v) == false)
                            {
                                vis.add(v);
                                queue.offer(new int[]{newRow,newCol,mask});
                            }
                        }
                    }
                    else if(ch>='a' && ch<='z')
                    {
                        //then we have to collect this key and then we can move simply
                        int key = keys.get(ch);
                        int newMask = mask|(1<<key);
                        String v = newRow+"-"+newCol+"-"+newMask;
                        if(vis.contains(v) == false)
                        {
                            queue.offer(new int[]{newRow,newCol,newMask});
                            vis.add(v);
                        }
                        
                    }
                }
            }
            steps++;
        }
        return -1;
    }
    public int myWay(String[] grid)
    {
        HashMap<Character,Integer> keys = new HashMap<>();
        int number = 0;
        int startingRow = -1;
        int startingCol = -1;
        for(int i=0;i<grid.length;i++)
        {
            String row = grid[i];
            for(int j=0;j<row.length();j++)
            {
                char ch = row.charAt(j);
                if(ch>='a' && ch<='z')
                {
                    keys.put(ch,number);
                    number++;
                }
                else if(ch=='@')
                {
                    startingRow = i;
                    startingCol = j;
                }
            }
        }
        return bfs(grid,keys,startingRow,startingCol,number);
    }
    public int shortestPathAllKeys(String[] grid) {
        return myWay(grid);
    }
}
