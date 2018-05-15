package com.igasm.lambdas_part_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ElementUtils {

    public static <T> List<T> allMatches(List<T> entries, Predicate<T> predicate){
        List<T> results = new ArrayList<>();
        for(T entry : entries){
            if(predicate.test(entry)){
                results.add(entry);
            }
        }
        return results;
    }

    public static <T, R> List<R> transformedList(List<T> entries, Function<T, R> transformFunc){
        List<R> results = new ArrayList<>();
        for(T entry : entries){
            results.add(transformFunc.apply(entry));
        }
        return results;
    }

}
