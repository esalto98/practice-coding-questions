import java.util.HashMap;

public class deleteAndEarn {
    private int[] buckets;
    private HashMap<Integer, Integer> houses = new HashMap<Integer, Integer>();

    public int solution(int[] nums) {
        int[] buckets = new int[10001];

        // sort and combine same values
        for (int i = 0; i < nums.length; i++) {
            buckets[nums[i]] += nums[i];
        }

        this.buckets = buckets;

        return dp(buckets.length - 1);
    }

    int dp(int i) {
        // using house robber algo
        if (i == 0)
            return buckets[0];
        if (i == 1)
            return Math.max(buckets[0], buckets[1]);

        if (!houses.containsKey(i)) {
            int robCurrHouse = buckets[i] + dp(i - 2);
            int dontRobCurr = dp(i - 1);

            houses.put(i, Math.max(dontRobCurr, robCurrHouse));
        }
        return houses.get(i);
    }
}
