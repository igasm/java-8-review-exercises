package com.igasm.lambdas_basics.e1;

public class Utils {

    public static int methodWitheCharacterComparator(String s1, String s2){
        if(s1.contains("e") && !s2.contains("e")) return -1;
        else if (!s1.contains("e") && s2.contains("e")) return 1;
        else return 0;
    }

}
