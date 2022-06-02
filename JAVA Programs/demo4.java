/**
 * while loop:
 * it is an entry controlled loop
 * do while is exit controlled loop.i.e. do while loop will execute at least once
 * 
 */
public class demo4 {

    public static void main(String[] args) {
        
        int i;
        for(i=0;i<1000;i++){
            System.out.println(i);
            if(i==998){
                break;
            }
        }
        System.out.println("End of program");
    }
}