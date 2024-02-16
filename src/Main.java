import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Input:\n");
            Calculator calc = new Calculator();
            calc.calculate();
        } catch (RuntimeException e) {
            System.out.println("throws Exception 0");
        }
    }
    static class Calculator {
        Scanner scanner = new Scanner(System.in);
        void calculate() {
            int a = scanner.nextInt();
            String operation = scanner.next();
            int b = scanner.nextInt();

            if (a < 0 || a > 10 || b < 0 || b > 10) {
                System.out.println("throws Exception 1");
                System.exit(0);
            }
            if (a.length() > 5) {
                System.out.println("throws Exception 1");
                System.exit(0);
            }
            if (operation.equals("+")) {
                System.out.println("Output:\n" + (a+b));
            }
            if (operation.equals("-")) {
                System.out.println("Output:\n" + (a-b));
            }
            if (operation.equals("*")) {
                System.out.println("Output:\n" + (a*b));
            }
            if (operation.equals("/")) {
                System.out.println("Output:\n" + (a/b));
            } /*else {
                System.out.println("throws Exception 2");
            }*/
        }
    }
}