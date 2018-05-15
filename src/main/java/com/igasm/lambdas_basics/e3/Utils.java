package com.igasm.lambdas_basics.e3;

public class Utils {

    public static <T> T betterElement(T e1, T e2, TwoElementPredicate<T> twoElementPredicate){
        if(twoElementPredicate.makePredicate(e1, e2)) return e1;
        else return e2;
    }

}
