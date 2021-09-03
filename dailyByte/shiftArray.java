import java.util.Arrays;

/**
 * Given an array of 0's and 1's, 
 * move all of the 0's to the beginning of the
 * array and all of the 1's to the end of the array.
 */


public class shiftArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 0, 0, 1 };

        
        System.out.println(Arrays.toString(arr));
        solution(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void solution(int[] array) {
        //count 0 
        int zeros = 0;
        for(int i = 0; i < array.length; ++i){
            if(array[i] == 0)
                ++zeros;
        }
        //fill with 0's
        for(int j = 0; j < zeros; ++j)
            array[j] = 0;
        //fill rest with 1's
        for(int k = zeros; k < array.length; ++k)
            array[k] = 1;

    }
    
}


