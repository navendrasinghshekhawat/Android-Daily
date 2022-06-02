/**
 * demo3
 */
public class demo3 {

    public static void main(String[] args) {
        int i=0;
        for(;;){
            System.out.println("this will keep running"+ i);
            if(i>5){
                break;
            }
            i++;
        }
        System.out.println("end of program");
    }
}