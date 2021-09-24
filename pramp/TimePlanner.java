/**
 * 
 * input: slotsA = [[10, 50], [60, 120], [140, 210]] 
 * slotsB = [[0, 15], [60,70]] dur = 8 
 * output: [60, 68]
 * 
 * input: slotsA = [[10, 50], [60, 120], [140, 210]] 
 * slotsB = [[0, 15], [60,70]] dur = 12 
 * output: [] # since there is no common slot whose duration is 12
 * 
 * 
 * 
 * 
 * 
 */





public class TimePlanner {
    static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
        // your code goes here
        //
        int a = 0;
        int b = 0;

        while (a < slotsA.length && b < slotsB.length) {
            int low = Math.max(slotsA[a][0], slotsB[b][0]); // start
            int max = Math.min(slotsA[a][1], slotsB[b][1]); // end

            if (max - low >= dur)
                return new int[] { low, low + dur };

            if (slotsA[a][1] < slotsB[b][1])
                a++;
            else
                b++;

        }

        return new int[] {};

    }

    public static void main(String[] args) {

    }
}
