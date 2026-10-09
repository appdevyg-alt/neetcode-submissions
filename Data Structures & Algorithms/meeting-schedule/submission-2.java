/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));

        for (int i = 1 ; i < intervals.size(); i++)
        {
            Interval a = intervals.get(i-1);
            Interval b = intervals.get(i);

            if (b.start < a.end)
            return false;

        }
        return true;

    }
}