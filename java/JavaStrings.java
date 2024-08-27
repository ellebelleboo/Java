
public class JavaStrings {

    public static void main(String args[]) {
        String greetings = "Hello";
        System.out.println("greetings");
        
        //Length of a text
        /*String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The lenght of the txt string is: " + txt.lenght());
        */
        
        //Upper/lower Case
        String txt = "Hello class";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        //Obs räknar whtie space med
        /*String txt2 = "The lenght of the txt string is";
        System.out.println(txt2.indexOf("o"));
        */
        
        /*
        String txt3 = "we are coding today \"coding\"";
        System.out.println(txt3);
        */
        
        //new row \n
        String txt4 = "we are coding \ntoday";
        // \tab space
        String txt5 = "we are coding \ttoday";
        System.out.println(txt4);
        System.out.println(txt5);
        
    }
}
