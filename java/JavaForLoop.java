
public class JavaForLoop {

    public static void main(String args[]) {
        //For Loop basic sample
        /*
        for ( int i = 0; i < 10; i++){
            System.out.println(i);
        }
        */
        /*
        //For Loop basic sample 2
        for(int i = 0; i <=10; i = i +2){
            System.out.println(i);
        }
        */
        /*
        //For Loop basic sample 3 "for each"
        //Array
        String[] name = {"Bob", "Jacob", "Steve", "Joe"};
        for (String i : name){
            System.out.println(i);
        }
        */
        /*
        //For Loop basic sample 4 "Nested"
        for (int i = 1; i <= 2; i++){
            System.out.println("Outside: " +i); //Runs two times
            for (int j = 1; j <= 3; j++){
            System.out.println("Inside: " +j); // Runs six times "2 * 3"
        }
        }
        */
        //For Loop basic sample 5
        int number = 3;
        for(int i = 1; i <=10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
