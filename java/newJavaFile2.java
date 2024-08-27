
public class newJavaFile2 {
    
    public static void main(String args[]) {
        int myInt = 10;
        double myDouble = myInt;
        double myFloat = myInt;
        
        
        System.out.println(myInt);
        System.out.println(myDouble / 9);
        System.out.println(myFloat / 2);
        
        
        //Example 2
        
        //Int Score variable
        int Score = 700;
        //Int UserScore
        int userScore = 450;
        
        float percentage = (float) userScore / Score * 100.0f;
        System.out.println("User's percentage is: " +  percentage);
    }
}