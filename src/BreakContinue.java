public class BreakContinue {
    public static void main(String[] args) {
        var counter = 1;
//        while (true) {
//            System.out.println("Contoh Break " + counter);
//            counter++;
//
//            if (counter > 10) {
//                break;
//            }
//        }
//        System.out.println("perulangan Berhenti!");

        for (; counter <= 20; counter++) {
            if (counter % 2 == 0) {
                continue;
            }

            System.out.println("Ganjil " + counter);
        }

    }
}
