import java.util.HashMap;
//given an array steps 
class minStepCost {
    HashMap<Integer, Integer> minCost = new HashMap<>();
    int[] cost;

    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        return dp(cost.length);

    }

    private int dp(int i) {
        // base cases
        if (i < 2)
            return 0;

        // if not in hashmap than calc using recursion
        if (!minCost.containsKey(i)) {
            int takeOneStep = cost[i - 1] + dp(i - 1);
            int takeTwoStep = cost[i - 2] + dp(i - 2);
            minCost.put(i, Math.min(takeOneStep, takeTwoStep));
        }

        return minCost.get(i);
    }

    public static void main(String[] args) {
        minStepCost test = new minStepCost();
        //test solution 
        int[] costArr = { 10, 15, 20 };
        System.out.println(test.minCostClimbingStairs(costArr));
    }
    
}