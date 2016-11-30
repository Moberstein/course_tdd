import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        String dividend = scanner.next();
        String divisor = scanner.next();

        Division division = new Division(dividend, divisor);
        Object result = division.divide();

        System.out.printf("%s / %s = %s", dividend, divisor, result);
    }
}
