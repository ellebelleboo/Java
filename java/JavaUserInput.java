import java.util.Scanner;//Import scanner class
public class JavaUserInput {


    public static void main(String args[]) {
        Scanner text = new Scanner(System.in);//creating the scanner orj
        System.out.println("Enter your name?");
        
        String userName = text.nextLine(); //reads the scanner orj"User input"
        System.out.println("Your name is: " + userName);
        
    }
}
