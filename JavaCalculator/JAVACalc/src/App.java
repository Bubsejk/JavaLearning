import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("First number is " + number1);
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        System.out.println("Second number is " + number2);
        System.out.println("Enter Task.");
        int tasknumber = scanner.nextInt();
        int number3;
        switch(tasknumber) {
            case 1:
            number3 = number1 + number2;
            System.out.println("Resould adding " + number3);
            break;
            case 2:
            number3 = number1 - number2;
            System.out.println("Resould substring " + number3);
            break;
            case 3:
            number3 = number1 * number2;
            System.out.println("Resould multiply " + number3);
            break;
            case 4:
            number3 = number1 / number2;
            System.out.println("Resould devide " + number3);
            break;
            case 5:
            number3 = number1 * number1;
            System.out.println("Resould Upper first " + number3);
            number3 = number2 * number2;
            System.out.println("Resould Upper second " + number3);
            break;
        }
        
    }
}
