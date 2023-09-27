package gmail.chaki.bubalo;

public class Main {
    public static void main(String[] args) {
        byte aByte = (byte)90;   //-128 ... 127
        short aShort = 93; // -32768... 32767
        int aInt = 890;
        int bInt = 900000000;
        long aLong = 1200L;
        float aFloat = 4.2f;
        double aDouble = 2.1;
        char aChar = '\u0000';
        boolean aBoolean = false;


        System.out.println(aByte + aByte);
        System.out.println(aInt - aInt);
        System.out.println(aFloat / aFloat);
        System.out.println(aDouble * aDouble);
        System.out.println(5.0 / 2);


        if (aByte>aShort) {
            System.out.println(aByte + " > "+ aShort + " = Верно ");
        }
        else {
            System.out.println(aByte + " > "+ aShort + " = Не верно ");
        }


        if (aByte < 106 && aLong > 79) {
            System.out.println("Выполнены оба условия");
        }
        if (aByte < 106 || aLong > 1300) {
            System.out.println("Выполнено одно из условий");
        }

        System.out.println("Переполнение: " + (byte) (aByte + 48));
        System.out.println("Переполнение: " + (bInt * bInt));

        System.out.println(aInt + aDouble);

    }
}