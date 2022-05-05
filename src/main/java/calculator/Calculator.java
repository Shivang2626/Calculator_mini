package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("Calculator Using Devops : ");
            System.out.print("1 : Factorial\n2 : Square Root\n3 : Power\n4 : Natural Logarithm\n" +
                    "5 : Exit\nChoose Your Choice : ");
            int ch;
            try {
                ch = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (ch) {
                case 2:
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root is : " + calc.getSquareRoot(num1));
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Turning Off......");
                    return;
            }
        } while (true);
    }
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public double getSquareRoot(double num) {
        logger.info("[SQUARE ROOT OF] - " + num);
        double ans = Math.sqrt(num);
        logger.info("[ANS - SQUARE ROOT] - " + ans);
        return ans;
    }


}