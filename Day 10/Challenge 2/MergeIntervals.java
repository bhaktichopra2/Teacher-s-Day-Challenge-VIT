import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] lastMerged = merged.get(merged.size() - 1);

            if (currentInterval[0] <= lastMerged[1]) {
                lastMerged[1] = Math.max(lastMerged[1], currentInterval[1]);
            } else {
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        System.out.println("Original intervals: " + Arrays.deepToString(intervals));

        int[][] result = solution.merge(intervals);

        System.out.println("Merged intervals:   " + Arrays.deepToString(result));
        // Expected output: [[1, 6], [8, 10], [15, 18]]
    }
}
