/**
 * while5
 */
public class while5 {

    public static void main(String[] args) {
        int row=(int)(Math.random()*20);
        System.out.println("total rows =" +row);
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}