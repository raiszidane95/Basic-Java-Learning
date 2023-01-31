public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10_000L;

        Byte iniByte = null;
        iniByte = 10;
        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);


        //Konversi tipedata Primitif ke tipe data Bukan primitif

        int iniInt = iniByte;

        System.out.println(iniInt);
    }
}
