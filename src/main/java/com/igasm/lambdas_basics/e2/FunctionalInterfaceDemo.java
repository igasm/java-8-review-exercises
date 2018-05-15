package com.igasm.lambdas_basics.e2;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "aaaa";
        //is first or second String longer
        String longer = StringUtils.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        System.out.println(longer);

        //kind of fake
        String betterString = StringUtils.betterString(str1, str2, (s1, s2) -> true);
        System.out.println(betterString);
    }

}
