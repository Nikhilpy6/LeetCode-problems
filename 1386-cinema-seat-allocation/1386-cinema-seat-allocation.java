class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
      int count=0;
      HashMap<Integer,List<Integer>> hm =new HashMap<>();
      for(int seats[]:reservedSeats){
        if(hm.containsKey(seats[0])){
          hm.get(seats[0]).add(seats[1]);
        }
        else{
          hm.put(seats[0],new ArrayList<Integer>(Arrays.asList(seats[1])));
        }
      }
    count = (n -hm.size()) * 2; //  here no reservation
		for (List<Integer> list: hm.values()) {
			boolean filled = false;
			if (!list.contains(2) && !list.contains(3) && !list.contains(4) && !list.contains(5)) {
				filled = true;
				count += 1;
			}
			if (!list.contains(6) && !list.contains(7) && !list.contains(8) && !list.contains(9)) {
				filled = true;
				count += 1;
			}
			if (!filled) {
				if (!list.contains(4) && !list.contains(5) && !list.contains(6) && !list.contains(7)) {
					count += 1;
				}
			}
    }
      return count;
  }
} 