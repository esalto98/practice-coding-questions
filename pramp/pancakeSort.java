public class pancakeSort {
    static int[] solution(int[] arr) {
    // your code goes here
    //loop until its sorted
   
   for(int i = arr.length - 1; i > 0; --i){
     int maxIndex = findMaxIndex(arr, i);
     flip(arr, maxIndex);
     flip(arr, i);
   }
    
    return arr;
    
  }
  
  static int findMaxIndex(int[] arr, int index){
    int largestIndex = 0;
    for(int i = 0; i <= index; ++i)
      largestIndex = arr[i] > arr[largestIndex] ? i : largestIndex;
    
    return largestIndex;
    
  }
  
  static void flip(int[] arr, int k) {
    
    int i = 0;
    int j = k;
    int temp = 0;

    while( i < j){
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      ++i;
      --j;
    }
    
  }

  public static void main(String[] args) {

  }
}
