
public class JavaBreakAndContinue {

    public static void main(String args[]) {
        
        /*
        //break loop
        for(int i = 0; i < 10; i++){
        if(i == 7){
            break;
        }
            System.out.println(i);
        }
        */
        /*
        //continue loop  
       for(int i = 0; <10; i++){
        if(i == 1){
            continue;
        }
        System.out.println(i);
        }
        */
        //break sample
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
            if(i == 5){
                break;
            }
        }
        
        
    }
}
