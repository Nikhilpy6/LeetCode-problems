class Solution {
    public double angleClock(int hour, int minutes) {
        double hr = (5.5*minutes);
        double min = (30*hour);
      // System.out.println(hr + "+"+ min);
      double ans = Math.abs(hr-min);
      double a = Math.min(ans,360-ans);
      return a;
    }
}