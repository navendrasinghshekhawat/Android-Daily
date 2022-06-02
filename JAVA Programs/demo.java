import java.util.Scanner;
class demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first integer");
        int i=sc.nextInt();
        System.out.print("Enter Second integer");
        int j=sc.nextInt();
        int c= i+j;
        System.out.println("Sum=" + c);
        sc.close();
    }
}
