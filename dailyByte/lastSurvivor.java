// Given two integers m and n, loop repeatedly through an array of m and remove each nth element. 
// Return the last element left. 
//(If m = 7 and n = 4, 
//then begin with the array 1 2 3 4 5 6 7 and remove, in order, 4 1 6 5 2 7 and return 3.)

public class lastSurvivor {
    public static void main(String[] args) {
        
        System.out.println(solution(7, 4));

    }

    public static int solution(int m, int n) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
        int lastIndex = josephus(7, 4);
        return arr[lastIndex];

    }
    
    public static int josephus(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;    // (k+1 + josephus(n-1, k)-1-1) % n + 1)
    }
}
