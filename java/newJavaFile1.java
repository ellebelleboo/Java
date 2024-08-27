
public class newJavaFile1 {
      
    public static void main(String args[]){
        String name = "Bob";
        System.out.println("Hello" + name);
        
        //First&Last name variables
        String firstName = "Bob";
        String lastName = "Longson";
        
        //Combines the names into fullname variable
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        
        //two int variables "37" "3"
        int x = 37;
        int y = 3;
        //addition
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x *  y);
        System.out.println(x / y);
        
        int z = 10;
        System.out.println(x / y + z); 
      
        boolean isCodingFun = true;
        boolean funOutDoorDay = false;
        System.out.println("Is coding fun");
        System.out.println(isCodingFun);
        System.out.println("Is it fun to go outside against your will?");
        System.out.println(funOutDoorDay);
        
        int items = 50;
        float costPerItem = 7.99f;
        float totalCost = items * costPerItem;
        char currency = '$';
        
        //Print Variables
        System.out.println("Number of items: " +items);
        System.out.println("Cost per item: " +costPerItem + currency);
        System.out.println("Total cost = " +totalCost +currency);
        
        
        
    }
}
           