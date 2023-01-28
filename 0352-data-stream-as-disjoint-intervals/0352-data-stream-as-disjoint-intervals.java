class SummaryRanges {
 TreeSet<Integer> nums;
    SummaryRanges() {
        nums = new TreeSet<>();
    }
    
    void addNum(int value) {
        nums.add(value);
    }
    
    List<List<Integer>> getIntervals() {
        List<List<Integer>> intervals= new ArrayList<>();
        int start = nums.first();
        int end = nums.first();
        int i = 0;
        for (Integer val : nums.tailSet(nums.first()+1)) {
            if (val - end == 1) {
                end = val;
            } else {
              List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);
                intervals.add(list);
                i++;
                start = end = val;
            }
        }
        List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);
                intervals.add(list);
        return intervals;
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */