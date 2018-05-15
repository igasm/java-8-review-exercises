package com.igasm.lambdas_basics.e3;

@FunctionalInterface
public interface TwoElementPredicate<T> {

    public boolean makePredicate(T element1, T element2);

}
