package javasolution;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by 汤伟强 on 2015/6/8.
 */
public class Solution057 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (intervals==null||newInterval==null)
            return intervals;
        if (intervals.size()==0){
            intervals.add(newInterval);
            return  intervals;
        }

        ListIterator<Interval> iterator = intervals.listIterator();
        while (iterator.hasNext()){
            Interval tmp = iterator.next();
            if (newInterval.end < tmp.start){
                iterator.previous();
                iterator.add(newInterval);
                return intervals;
            }else {
                if (tmp.end < newInterval.start){
                    continue;
                }else {
                    newInterval.start = Math.min(tmp.start, newInterval.start);
                    newInterval.end = Math.max(tmp.end, newInterval.end);
                    iterator.remove();
                }
            }
        }
        intervals.add(newInterval);
        return intervals;
    }
}
