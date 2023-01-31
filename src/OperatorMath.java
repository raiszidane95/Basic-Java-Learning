public class OperatorMath {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();
        System.out.println("------------------------- This is line ---------------------");
        // Augmented Assignments

        int c = 100;
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);
        System.out.println();
        System.out.println("------------------------- This is line ---------------------");

        // Unary Operator ++, --, -, +, !(Not);

        int d = 100;
        ++d;
        System.out.println(d);
        --d;
        System.out.println(d);
        System.out.println();
        System.out.println("------------------------- This is line ---------------------");

        // Operasi Perbandingan (Boolean: true or false);

        int number1 = 100;
        int number2 = 100;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);
        System.out.println();
        System.out.println("------------------------- This is line ---------------------");

        // Operasi Boolean;

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiakhir = nilaiAkhir >= 75;

        System.out.println("Lulus absen : " + lulusAbsen);
        System.out.println("Lulus nilai : " + lulusNilaiakhir);
        var lulus = lulusAbsen && lulusNilaiakhir;
        System.out.println("Apakah lulus? :" + lulus);


    }
}
