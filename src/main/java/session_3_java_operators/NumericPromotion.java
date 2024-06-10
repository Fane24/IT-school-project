package session_3_java_operators;

import java.sql.SQLOutput;

public class NumericPromotion {
    public static void main(String[] args) {
        short e = 10;
        int f = e + 5;

        long a = 100000000L;
        //wrapper classes

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Max Long value " + maxLongValue);
        System.out.println("Max Long value " + minLongValue);
        System.out.println("Max Integer value " + minLongValue);

        long testLongValue = 12314947289234L;

        //max int: 21474483647
        //max long: 92233720368547758007

        int newIntValue = (int)testLongValue;
        System.out.println("Test Long Value "+newIntValue);


    }
}
