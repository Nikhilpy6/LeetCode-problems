class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        Queue<Integer> qu= new LinkedList <>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(changed);
        
        for(int a: changed){
            if(!qu.isEmpty() && a==qu.peek()){
                qu.poll();
            }
            else{
                qu.offer(2*a);
                ans.add(a);
            }
        }
        if(qu.size()>0)return new int[0];
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        /*if(changed.length%2!=0)
            return new int[0];
       
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i: changed){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i=0;
       Arrays.sort(changed);
       List<Integer> ans=new ArrayList<>();
       for(int a: changed){
           if(map.get(a)==null)
               continue;
           if(map.get(2*a)==null)
               return new int[0];
           if(map.get(a)!=null && map.get(2*a)!=null){
               map.put(2*a,map.get(2*a)-1);
               map.put(a,map.get(a)-1);
               ans.add(a);
               
           }
               
       }
        int arr[]=new int[ans.size()];
         i=0;
        for(int v:ans){
            arr[i]=v;
            i++;
        }
       return arr;*/
            
    }
}