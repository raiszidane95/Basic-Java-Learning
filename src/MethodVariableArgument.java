public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("Ariston", 80, 80, 31, 30);

    }

    static void sayCongrats(String name, int... values) { // int... (Dengan int dan titik 3kali merupakan variable argument)
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " anda lulus!");
        } else {
            System.out.println("Maaf " + name + " anda tidak lulus");
        }
    }
}
