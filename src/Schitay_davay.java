import java.util.Scanner;
public class Schitay_davay {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Настучи два числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nВыбирай действие (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Ты дебил! Смотри какие операции доступны!");
                return;
        }
        System.out.print("\nРезультат сложнейших вычислений:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}