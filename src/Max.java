import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
//        int a, b;
//        a = 17;
//        b = 25;
//        var max = max(a, b);
//        int number = 12241;
//        int digit = ((number % 100) / 10) % 10;

//        System.out.println(max);
//        System.out.println(digit);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tensDigit = (n % 100) / 10;
        System.out.println(tensDigit);
    }

//    static int max(int number1, int number2) {
//        var result = number2;
//        if (number1 > number2) {
//            result = number1;
//        } else {
//        }
//        return result;
//    }


}
