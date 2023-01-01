class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        Stack<Integer> stack = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        stack.push(0);
        findPath(0, stack, result, graph);
        return result;
    }
    
    public void findPath(int node, Stack<Integer> stack, List<List<Integer>> result, int[][] graph) {
        if(node == graph.length-1) {
            result.add(new ArrayList(stack));
        }
        
        for(int adj : graph[node]) {
            stack.push(adj);
            findPath(adj, stack, result, graph);
            stack.pop();
        }
    }
}
