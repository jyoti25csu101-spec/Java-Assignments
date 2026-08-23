public class BitMaskUtility {

    static boolean isBitSet(int number, int position) {
        return (number & (1 << position)) != 0;
    }

    static int setBit(int number, int position) {
        return number | (1 << position);
    }

    static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

    static String toBinary32(int number) {

        String binary = Integer.toBinaryString(number);

        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        return binary;
    }
}
