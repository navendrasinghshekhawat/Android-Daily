import java.util.Scanner;

class ladder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int x=sc.nextInt();
        if(x>=10 && x<=20){
            if(x%2==0){
                System.out.println("x is even");
            }else{
                System.out.println("x is odd");
            }
        }else{
            System.out.println("x is not in range of 10 and 20");
        }

        sc.close();
    }
}

