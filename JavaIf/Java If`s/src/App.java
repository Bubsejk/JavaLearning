import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Check Numbers!");
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("Equal divisible 2");
        }
        if(number % 2 != 0){
            System.out.println("Not Equal divisible 2");
        }
    }
}
