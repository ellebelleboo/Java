
public class JavaItsLearning5 {

   
    public static void main(String args[]) {
        int points = 85; 
        int score = 0;
        
        if (points >= 90 && points <= 100) {
            score = 5;
        } else if (points >= 80 && points <= 89) {
            score = 4;
        } else if (points >= 70 && points <= 79) {
            score = 3;
        } else if (points >= 60 && points <= 69) {
            score = 2;
        } else if (points >= 25 && points <= 59) {
            score = 1;
        } else if (points >= 0 && points <= 25) {
            score = 0;
            return; 
        }
        
        System.out.println("Vitsord: " + score);
        
    }
}
