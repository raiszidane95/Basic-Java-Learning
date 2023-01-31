public class MethodReturnValue {
    public static void main(String[] args) {
        var hasil = sum(12, 3);
        System.out.println(hasil);
        System.out.println(sum(8, 5));
        System.out.println("__________________________");

        System.out.println(hitung(22, 11, "tambah"));
        System.out.println(hitung(20, 14, "minus"));
        System.out.println(hitung(20, 14, "default"));
    }

    static int sum(int number1, int number2) {
        var total = number1 + number2;
        return total;
    }

    static int hitung(int number1, int number2, String operasi) {
        switch (operasi) {
            case "tambah":
                return number1 + number2;
            case "minus":
                return number1 - number2;
            default:
                return 0;
        }
    }

}
