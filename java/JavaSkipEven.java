
public class JavaSkipEven {

    public static void main(String args[]) {
       //Loop from 1-10
       for(int i = 1; i <= 10; i++){
        //if even number skip
            if(i % 2 == 0){
                //skips in the loop
                continue;
            }
            //print odd numbers
            System.out.println(i);
        }
    }
}
