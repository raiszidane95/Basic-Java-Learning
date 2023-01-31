public class IfStatement {
    public static void main(String[] args) {
        var nilai = 73;
        var absen = 90;
        if (nilai >= 75 && absen >= 75) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 65 && absen >= 65) {
            System.out.println("Nilai anda C");
        } else {
            System.out.println("Nilai anda D");
        }
    }
}
