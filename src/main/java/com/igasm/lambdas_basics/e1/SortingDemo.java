package com.igasm.lambdas_basics.e1;

import java.util.Arrays;
import java.util.Comparator;

public class SortingDemo {

    public static void main(String[] args) {
        String[] array = {"London", "Madrid", "Brno", "Missisipi", "Sosnowiec"};

        Comparator<String> lengthComparator = (s1, s2) -> s1.length() - s2.length();
        Arrays.sort(array, lengthComparator);
        System.out.println(Arrays.asList(array));

        Comparator<String> reverseLengthComparator = (s1, s2) -> s2.length() - s1.length();
        Arrays.sort(array, reverseLengthComparator);
        System.out.println(Arrays.asList(array));

        Comparator<String> firstCharacterComparator = (s1, s2) -> s1.charAt(0) - s2.charAt(0);
        Arrays.sort(array, firstCharacterComparator);
        System.out.println(Arrays.asList(array));

        Comparator<String> eCharacterComparator = (s1, s2) -> {
          if(s1.contains("e") && !s2.contains("e")) return -1;
          else if (!s1.contains("e") && s2.contains("e")) return 1;
          else return 0;
        };
        Arrays.sort(array, eCharacterComparator);
        System.out.println(Arrays.asList(array));

        Arrays.sort(array, (s1, s2) -> Utils.methodWitheCharacterComparator(s1, s2));
        System.out.println(Arrays.asList(array));

        //using method reference
        Arrays.sort(array, Utils::methodWitheCharacterComparator);
        System.out.println(Arrays.asList(array));
    }

}
