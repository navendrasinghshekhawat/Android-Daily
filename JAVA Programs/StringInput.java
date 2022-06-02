import java.util.Scanner;

class StringInput{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String choice=sc.next();
    switch(choice)
    {
        case "Airline":
        System.out.println("Welcome to airline");
        break;

        case "Bus":
        System.out.println("Welcome to Bus");
        break;

        default:
        System.out.println("default printed");

    }
}
}