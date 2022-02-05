public class HighScore {
    public static void main(String[] args) {
        
        int[] randomNumberArray = {randomNumber(), randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()};
        for(int i = 0; i < randomNumberArray.length; i++){
            System.out.print(randomNumberArray[i] + " ");
        }

        int highScore = 0;

        for(int i = 0; i < randomNumberArray.length; i++){
            if(randomNumberArray[i] > highScore){
                highScore = randomNumberArray[i];
            } 
                
        }
        System.out.println("\n\nThe highest score is: " + highScore + " Give that man a cookie!");

         /** Task 3
          *  
          *   1. Using a for loop, find the highest score in the array and update the highScore.
          *   2. println("\n\nThe highest score is: <>. Give that man a cookie!");

          */


    }

        public static int randomNumber(){
            double randomNumber = Math.random() * 50000;
            return (int)randomNumber + 1;
        }    
}
