package javasolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2015/6/10.
 */
public class Solution056 {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1)
            return intervals;

        Collections.sort(intervals, new IntervalComparator());

        ArrayList<Interval> result = new ArrayList<Interval>();

        Interval pre = intervals.get(0);
        for (int i =1; i < intervals.size(); i++){
            Interval cur = intervals.get(i);

            if (pre.end >= cur.start){
                Interval merged = new Interval(pre.start, Math.max(pre.end,cur.end));
                pre = merged;
            }else {
                result.add(pre);
                pre = cur;
            }
        }

        result.add(pre);

        return result;
    }

}

class  IntervalComparator implements Comparator<Interval> {
    public int compare(Interval i1, Interval i2){
        return i1.start - i2.start;
    }
}
