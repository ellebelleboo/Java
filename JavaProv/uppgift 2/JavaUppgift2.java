public class JavaUppgift2 {

    public static void main(String args[]) {
        int [] numbers = {5, 10, 25,75,125};
        int [] numbers2 = {50, 100, 250, 750, 25};
        
        int Sum1 = 0;
        for(int number : numbers){
            Sum1 += number;
        }
        System.out.println("Sum1 total sum: " + Sum1);
        
        int Sum2 = 0;
        for( int number : numbers2){
            Sum2 += number;
        }
        System.out.println("Sum2 total sum: " + Sum2);
        double divisionResult = (double) Sum1 / Sum2;
        System.out.println("Division results: " + divisionResult);
        
    }
}
