/*
This question is asked by Amazon. 
Given a string representing the sequence of 
moves a robot vacuum makes, 
return whether or not it will return to its 
original position. 
The string will only contain L, R, U, and D characters, 
representing left, right, up, and down respectively.
*/
class vaccumPos {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String moves = "UDLR"; 
    String moves2 = "URURD";
    String moves3 = "LR"; 
    String moves4 = "RUULLDRD"; 

    System.out.println(isOriginalPos(moves)); //true
    System.out.println(isOriginalPos(moves2)); //false
    System.out.println(isOriginalPos(moves3)); //true
    System.out.println(isOriginalPos(moves4)); //true
  }

  public static boolean isOriginalPos(String moves){
    boolean originalPos = false;
    String moveOptions = "UDLR";
    moves = moves.toUpperCase().replaceAll("[^UDLR]", "");
    
    if(moves == null)
      return originalPos;
    if(moves.equals(moveOptions))
      return true;

    int[] countMoves = {0,0,0,0};
    //iterate through move options to count occurences of moves in moves string
    for(int i = 0; i < moveOptions.length(); ++i){
      for(int j = 0; j < moves.length(); ++j){
        //count moves
        if(moveOptions.charAt(i) == moves.charAt(j))
          countMoves[i]++;
      }
    }
    //if diference of count within set of opposite moves = 0 than back to same spot 
    if((countMoves[0] - countMoves[1]) - (countMoves[2] - countMoves[3]) == 0 )
      originalPos = true;

    return originalPos;
 }
}