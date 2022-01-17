import java.util.HashMap;

public class houseRobber {
    private int[] nums;
    private HashMap<Integer, Integer> houses = new HashMap<Integer, Integer>();

    public int dp(int i) {
        if (i == 0)
            return nums[0];
        if (i == 1)
            return Math.max(nums[0], nums[1]);

        if (!houses.containsKey(i)) {
            int robCurrHouse = nums[i] + dp(i - 2);
            int dontRobCurr = dp(i - 1);

            houses.put(i, Math.max(dontRobCurr, robCurrHouse));
        }
        return houses.get(i);
    }

    public int rob(int[] nums) {
        this.nums = nums;
        return dp(nums.length - 1);

    }
    public static void main(String[] args) {
        //TODO
        /*
        give an array of money is houses, robing adjacent houses will alert the police
        give the largest sum of money, taking rule into consideration
         */
    }
}
