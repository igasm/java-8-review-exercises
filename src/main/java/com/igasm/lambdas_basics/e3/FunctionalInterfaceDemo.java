package com.igasm.lambdas_basics.e3;

//functional interface that uses generics
public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        //with String
        String str1 = "a";
        String str2 = "aaaa";
        //is first or second String longer
        String longer = Utils.betterElement(str1, str2, (String s1, String s2) -> s1.length() > s2.length());
        System.out.println(longer);

        //kind of fake
        String betterString = Utils.betterElement(str1, str2, (s1, s2) -> true);
        System.out.println(betterString);

        //With Integer
        Integer i1 = 10;
        Integer i2 = 52;
        Integer higherValue = Utils.betterElement(i1, i2, (Integer int1, Integer int2) -> int1.intValue() > int2.intValue());
        System.out.println(higherValue);

        //kind of fake again
        Integer betterInteger = Utils.betterElement(i1, i2, (Integer int1, Integer int2) -> true);
        System.out.println(betterInteger);
    }

}
