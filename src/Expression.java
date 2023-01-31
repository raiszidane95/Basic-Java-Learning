import java.util.Date;

public class Expression {
    public static void main(String[] args) {
        /*
        - Expression adalah konstruksi dari variabel operator dan
        pemanggilan method yang meng evaluasi menjadi sebuah single value
        - Expression adalah core component dari statement
         * */

        int value; // Expression (single value)
        value = 100;// Expression (yang menghasilkan single value)

        /*
        - Kumpulan expression
         * */
        // assignment statement
        double aValue = 8933.234;

        // Method invocation statement
        System.out.println("Hello World!");

        // Object creation statement
        Date date = new Date();
    }
}
