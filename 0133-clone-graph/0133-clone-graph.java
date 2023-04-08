/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
      if(node==null)
        return node;
       
      HashMap<Node,Node> hm = new HashMap<>();
      Queue<Node> qu = new LinkedList<>();
      Node newnode=new Node();
       newnode.val=node.val;
      hm.put(node,newnode);
      qu.offer(node);
      while(!qu.isEmpty()){
        int s=qu.size();
        while(s-- >0){
          Node cur=qu.poll();
          for(Node n:cur.neighbors){
            if(!hm.containsKey(n)){
              Node nn=new Node();
              nn.val=n.val;
              qu.offer(n);
              hm.put(n,nn);
            }
             Node newList=hm.get(cur);
             newList.neighbors.add(hm.get(n));
          }
          
        }
       
      }
      return hm.get(node);
      
    }
}