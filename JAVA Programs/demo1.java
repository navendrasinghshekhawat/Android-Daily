import java.util.Scanner;
class demo1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name");
        String name= sc.next();
        System.out.print("Enter full name");
        sc.nextLine();
        String fullName=sc.nextLine();
        System.out.println(name);
        System.out.println(fullName);
        sc.close();
    }
}
