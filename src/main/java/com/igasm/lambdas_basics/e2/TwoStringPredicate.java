package com.igasm.lambdas_basics.e2;

@FunctionalInterface
public interface TwoStringPredicate {

    public boolean makePredicate(String s1, String s2);

    //this will not compile because of @FunctionalInterface annotation
//    boolean makeAnotherPredicate(String s1, String s2);
}
