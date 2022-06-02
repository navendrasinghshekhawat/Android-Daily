import java.util.Scanner;
//wap to fine greatest among the 3 nos taken from keyboard;
//wap using String Switch cases
//wap to explain if elseif ladder

class great{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //logic
        if(a>b && a>c){
            System.out.println("A is Greater");
        }else if(b>a && b>c){
            System.out.println("B is greater");
        }else{
            System.out.println("C is Greater");
        }

        sc.close();
    }
}