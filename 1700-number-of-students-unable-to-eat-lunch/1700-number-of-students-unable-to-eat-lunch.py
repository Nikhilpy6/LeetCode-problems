class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        while(len(students)):
          if sandwiches[0] in students:
            if(sandwiches[0]==students[0]):
              sandwiches.pop(0)
              students.pop(0)
            elif sandwiches[0]!=students[0]:
              students.append(students.pop(0))
            
          else:
            return len(students)
        
    
        return 0