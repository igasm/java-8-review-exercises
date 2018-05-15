package com.igasm.lambdas_basics.methods_references;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<String> demoList = Arrays.asList("a","b","c");
        //method reference example
        demoList.forEach(System.out::println);
    }

}
