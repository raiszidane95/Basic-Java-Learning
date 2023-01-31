public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Ariston";
        stringArray[1] = "Rais";
        stringArray[2] = "Zidane";
        // Atau menggunakan metode dibawah ini
        String[] stringArray2 = new String[1];

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //Array Initializer

        String[] fullName = {
                "Ariston", "Rais", "Zidane"
        };
        int[] arrayInt = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        System.out.println();
//        int[] arrayInt = System.out.println(arrayInt.ength);
        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Ariston", "Rais"},
                {"Joko"}
        };
        System.out.println(members[0][1]);
    }

}
