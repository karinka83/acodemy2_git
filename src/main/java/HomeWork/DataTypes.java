package HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {

        //Float (!!! - 55.99F)
        float floatDigit = 55.99F;
        System.out.println("floatDigit");
        System.out.println(55.99F);

        //Double (!!! - 2850980.92D)
        double doubleDigit = 2850980.92D;
        System.out.println(doubleDigit);
        System.out.println(2850980.92D);

        //integral
        byte countOfDogLegs =4;
        System.out.println(countOfDogLegs);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.valueOf(countOfDogLegs));
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);

        //short
        short yearOfLatvianIndependence=1918;
        System.out.println(yearOfLatvianIndependence);
        short telephoneCodeOfLatvia =371;
        System.out.println(telephoneCodeOfLatvia);

        //Integer
        int populationOfLatvia = 1900000;
        System.out.println(populationOfLatvia);
        int [] ArrayOfFirstThreeDigits = {1, 2 ,3};
        System.out.println(ArrayOfFirstThreeDigits);
        int a_value = 10;
        int b_value = 15;

        System.out.println(Integer.max(a_value, b_value));
        System.out.println(Integer.compare(10, 15));
        System.out.println(Integer.compare(a_value, b_value));

        //long
        long latvianTeritory = 64589L;
        System.out.println(latvianTeritory);

        long populationOfJelgava = 55336L;
        System.out.println(populationOfJelgava);

        //char
        char [] someLetters = {'A', 'B', 'C', 'c', 'D','F'};
        System.out.println(Arrays.toString(someLetters));
        System.out.println(Array.getLength(someLetters));
        System.out.println(someLetters[2]);
        System.out.println(someLetters[4]);

    }
}
