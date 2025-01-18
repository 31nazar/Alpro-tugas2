public class TipeDataJava {

    public static void main(String[] args) {
        byte tipeByte = 127;
        short tipeShort = 32000;
        int tipeInt = 100000;
        long tipeLong = 10000000000L;
        float tipeFloat = 10.5f;
        double tipeDouble = 12345.6789;
        char tipeChar = 'A';
        boolean tipeBoolean = true;

        String tipeString = "Ini adalah String di Java";

        System.out.println("===== Tipe Data Primitif =====");
        System.out.println("byte: " + tipeByte);
        System.out.println("short: " + tipeShort);
        System.out.println("int: " + tipeInt);
        System.out.println("long: " + tipeLong);
        System.out.println("float: " + tipeFloat);
        System.out.println("double: " + tipeDouble);
        System.out.println("char: " + tipeChar);
        System.out.println("boolean: " + tipeBoolean);

        System.out.println("\n===== Tipe Data Referensi =====");
        System.out.println("String: " + tipeString);

        System.out.println("\n===== Ukuran Tipe Data (bit) =====");
        System.out.println("byte: " + Byte.SIZE);
        System.out.println("short: " + Short.SIZE);
        System.out.println("int: " + Integer.SIZE);
        System.out.println("long: " + Long.SIZE);
        System.out.println("float: " + Float.SIZE);
        System.out.println("double: " + Double.SIZE);
        System.out.println("char: " + Character.SIZE);
    }
}
