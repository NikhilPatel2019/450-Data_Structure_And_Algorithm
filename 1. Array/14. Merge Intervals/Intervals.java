import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Intervals{

    public static void main(String[] args) {
        //https://medium.com/swlh/how-to-merge-intervals-step-by-step-cb2c1edf1cd0
        int[][] array = { {1,3}, {2,4}, {5,7}, {6,8} };
        System.out.println("Given Intervals: " + Arrays.deepToString(array));
        System.out.println("Merged Intervals: " + Arrays.deepToString(mergeIntervals(array)));

    }

    static int[][] mergeIntervals(int[][] intervals){

        //Edge CASES
        if(intervals.length <=1){
            return intervals;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                return Integer.compare(arr1[0], arr2[0]);
            }
        });

        //Comparing Intervals
        int[][] uniqueIntervals = new int[intervals.length][2];

        int startTime = intervals[0][0];
        int endTime = intervals[0][1];
        int j=0;

        for(int i=1;i< intervals.length; i++){
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if(currentStart <= endTime){
                endTime = Math.max(currentEnd, endTime);
            }
            else{
                uniqueIntervals[j][0] = startTime;
                uniqueIntervals[j][1] = endTime;
                startTime = currentStart;
                endTime = currentEnd;
                j++;
            }
        }
        uniqueIntervals[j][0] = startTime;
        uniqueIntervals[j][1] = endTime;
        int[][] resizeArray = Arrays.copyOf(uniqueIntervals, j+1);
        return resizeArray;

    }
}

