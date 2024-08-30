
public class JacaItsLearning7 {

    public static void main(String args[]) {
      int[] numbers = {10, 20, 30, 40, 50};
      for (int number : numbers){
          System.out.println(number + " ");
      }
        System.out.println("First number: " + numbers[0]);
        System.out.println("Last number: " + numbers[4]);
        
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        
        double result = sum / 2.0;
        System.out.println("Sum divided by 2: " + result);
        
    }
}
