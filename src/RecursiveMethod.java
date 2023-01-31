public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(3));
        System.out.println(factorialLoop(5));
        System.out.println("____________ Factorial with method Recursive");
        System.out.println(factorialRecursive(10));
    }

    static int factorialLoop(int value) {
        var result = 1;
        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    // With Recursive Method
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
