public class Beer {
    public static void main(String[] args) {
       for (int i = 99; i >= 1; i--){
          sing(i);
       }
       // Task 2: make a for loop that starts at i = 99, and finishes at i=1.
    }

    public static void sing(int i) {
       System.out.println(i + " bottles of beer on the wall, " + i + 
       " bottles of beer! take one down, pass it around, "+ (i-1)
        + " bottles of beer on the wall!");
    }

}
