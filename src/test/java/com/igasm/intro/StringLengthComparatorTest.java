package com.igasm.intro;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class StringLengthComparatorTest {

    @Test
    public void testSortingWithProvidinClass(){
        String[] array = {"aaa", "a", "aa"};
        Arrays.sort(array, new StringLengthComparator());
        String[] expected = {"a", "aa", "aaa"};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortingWithProvidingAnonymousClass(){
        String[] array = {"aaa", "a", "aa"};
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        String[] expected = {"a", "aa", "aaa"};
        assertArrayEquals(expected, array);
    }


}