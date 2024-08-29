
public class JavaArrays {

    public static void main(String args[]) {
        //String Arrya
        String[] names = {"Bob", "Steve", "Jacob",};
        // int array
        int[] Numbers = {1, 2, 3, 4, 5, 6};
        //Always start from zero when counting trough lists (0-9)
        System.out.println(names[1]);// the second name (0=1 1=2)
        System.out.println(Numbers[2]);//This case [2] is actually 3
        
        //Lenght of an Array
        System.out.println(names.length);
        //counts the lenght (amount) of the names
        System.out.println(Numbers.length);
        //Name Loop "Prints Names"
        for(int i = 0; i < Numbers.length; i++){
            System.out.println(names[i]);
            //counts the names i = 0 starts from the first name, i++ counts up
        }
        //int Loop "Prints Numbers2
        for(int i = 0; i < Numbers.length; i++){
            System.out.println(Numbers[i]);
        }
 
    }
}
