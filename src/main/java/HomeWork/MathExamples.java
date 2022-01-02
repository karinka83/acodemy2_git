package HomeWork;

import java.sql.SQLOutput;

public class MathExamples {
    public static void main(String[] args) {
        //Float Math examples
        Float floatMath1 = 322.499994F;
        Float floatMath2 = 43.333333F;
        System.out.println(floatMath2+floatMath1);
        System.out.println(322.499994F+43.333333F);
        System.out.println(floatMath1-floatMath2);

        //Double Math Examples
        Double DoubleMath1 = 2.020202012022245D;
        Double DoubleMath2 = 2.020202012022247D;
        System.out.println(DoubleMath2-DoubleMath1);
        System.out.println(DoubleMath1+DoubleMath1);

        //Byte Math Examples
        Byte ByteMath1 =125;
        Byte ByteMath2 =111;
        System.out.println(ByteMath1+ByteMath2);
        System.out.println(ByteMath1/ByteMath2);

        //Integer Math Examples
        int IntMath1 = 2143250425;
        int IntMath2 = 2143250421;
        System.out.println(IntMath1+IntMath2);
        System.out.println(IntMath1-IntMath2);

        short shortMath1 = -10212;
        short shortMath2 = 11111;
        System.out.println(shortMath1*shortMath2);
        System.out.println(shortMath1-shortMath2);

        long longMath1 = 10000000087660987L;
        long longMath2 = 10000000087660989L;
        System.out.println(longMath2-longMath1);
        System.out.println(longMath2/longMath1);
    }
}