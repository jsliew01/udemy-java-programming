public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 45;
        int englishGrade = 65;
        String language = "Java";

        if(chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")){
            System.out.println("You got the scholarship!");
        } else {
            System.out.println("You did not get the scholarship");
        }

        int credits = 56;
        double GPA = 1.2;

        if(credits >= 40 && GPA >= 2.0){
            System.out.println("You earned your diploma!");
        } else{
            System.out.println("Sorry, you need at least 40 credits and a minimum of 2.0 GPA");
        }
    }
}
