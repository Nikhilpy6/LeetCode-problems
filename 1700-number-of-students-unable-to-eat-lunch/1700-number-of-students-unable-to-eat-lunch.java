class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
      // Approach 1 (do as it is)
      
      //stack me hum add krenge saare sandwiches jo ki ek hi bar insert honge
//         Stack<Integer> st = new Stack<>();
//         for(int i=sandwiches.length-1;i>=0;i--){
//           st.push(sandwiches[i]);
//         }
      
      
//       //queue me hum add krenge student jo ki rear se insert and front poll honge
//         Queue<Integer> qu = new LinkedList<>();
//         for(int i=0;i<students.length;i++){
//           qu.add(students[i]);
//         }
      
       
        
          
//           while(!qu.isEmpty() && !st.isEmpty()){
//             int san = st.pop();
//             int stu = qu.poll();
            
//             if(san!=stu){
//               qu.add(stu);
//               st.push(san);
              
//             }
            
//           }
//       return qu.size();
          
          
// Approach -2
      // int stu_0=0;
      // int stu_1=0;
      
      int stu[]=new int[2];
      
      for(int i:students){
        stu[i]++;
      }
      
      for(int i=0;i<sandwiches.length;i++){
        int sand = sandwiches[i];
        if(stu[sand]==0){
          return students.length-i;
        }
        stu[sand]--;
      }
      return 0;
      
    }
}