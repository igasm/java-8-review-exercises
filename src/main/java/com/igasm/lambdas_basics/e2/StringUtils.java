package com.igasm.lambdas_basics.e2;

public class StringUtils {

    public static String betterString(String s1, String s2, TwoStringPredicate twoStringPredicate){
        if(twoStringPredicate.makePredicate(s1, s2)) return s1;
        else return s2;
    }

}
