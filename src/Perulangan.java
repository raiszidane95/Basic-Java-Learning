public class Perulangan {
    public static void main(String[] args) {
        // Perulangan For ----

        for (var counter = 1; counter <= 10; counter++) {
            System.out.println(counter);

        }
        System.out.println();

        // While Loop
        var counter = 1;
        while (counter <= 10) {
            System.out.println("Perulangan " + counter);
            counter++;
        }
        System.out.println();

        // Do While Loop
        var count = 1;
        do {
            System.out.println("Ini Perulangan Do-While " + count);
            count++;
        } while (count <= 10);
    }
}
