package com.igasm.intro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListUtilsTest {

    @Test
    public void givenListOfString_shouldReturnTheLast(){
        List<String> list = Arrays.asList("one", "two", "three");
        assertEquals(ListUtils.lastEntry(list), "three");
    }

    @Test
    public void givenEmptyList_shouldThrowRuntimeException(){
        final List<String> list = new ArrayList<>();
        Assertions.assertThrows(RuntimeException.class, () -> ListUtils.lastEntry(list));
    }

    @Test
    public void givenArrayOfString_shouldReturnTheLast(){
        String[] array = {"one", "two", "three"};
        assertEquals(ListUtils.lastEntry(array), "three");
    }

    @Test
    public void givenArrayOfLength0_shouldThrowRuntimeException(){
        String[] array = new String[0];
        Assertions.assertThrows(RuntimeException.class, () -> ListUtils.lastEntry(array));
    }

    @Test
    public void givenNotInitializedArray_shouldReturnNull(){
        String[] array = new String[5];
        assertEquals(ListUtils.lastEntry(array), null);
    }
}