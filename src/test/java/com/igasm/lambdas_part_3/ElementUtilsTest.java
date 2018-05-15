package com.igasm.lambdas_part_3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElementUtilsTest {

    List<String> words = Arrays.asList("Bee", "Lion", "Cat", "Dog", "Elephant", "Char", "Table");
    List<Integer> numbers = Arrays.asList(1, 10, 100, 1000, 10000);

    @Test
    public void shouldReturnOnlyStringWhichLengthIsLessThan4(){
        List<String> filtered = ElementUtils.allMatches(words, a -> a.length() < 4);
        List<String> expected = Arrays.asList("Bee", "Cat", "Dog");
        assertEquals(expected, filtered);
    }

    @Test
    public void shouldReturnOnlyWordsWithB(){
        List<String> filtered = ElementUtils.allMatches(words, w -> (w.contains("b") || w.contains("B")));
        List<String> expected = Arrays.asList("Bee", "Table");
        assertEquals(expected, filtered);
    }

    @Test
    public void shouldReturnOnlyEvenLengthWords(){
        List<String> filtered = ElementUtils.allMatches(words, w -> (w.length() % 2 == 0));
        List<String> expected = Arrays.asList("Lion", "Elephant", "Char");
        assertEquals(expected, filtered);
    }

    @Test
    public void shouldReturnOnlyNumbersGraterThan500(){
        List<Integer> expected = Arrays.asList(1000, 10000);
        List<Integer> filtered = ElementUtils.allMatches(numbers, n -> n > 500);
        assertEquals(expected, filtered);
    }

    @Test
    public void shouldAddExclamationMarkAtTheAndOfEachWord(){
        List<String> expected = Arrays.asList("Bee!", "Lion!", "Cat!", "Dog!", "Elephant!", "Char!", "Table!");
        List<String> excitingWords = ElementUtils.transformedList(words, s -> s + "!");
        assertEquals(expected, excitingWords);
    }

    @Test
    public void shouldDouble_a_characterForWordsInList(){
        List<String> expected = Arrays.asList("Bee", "Lion", "Caat", "Dog", "Elephaant", "Chaar", "Taable");
        List<String> withDoubledA = ElementUtils.transformedList(words, s -> s.replaceAll("a", "aa"));
        assertEquals(expected, withDoubledA);
    }

    @Test
    public void shouldReturnTheListOfLengthOfEachWord(){
        List<Integer> expectedLengths = Arrays.asList(3, 4, 3, 3, 8, 4, 5);
        List<Integer> calculated = ElementUtils.transformedList(words, w -> w.length());
        assertEquals(expectedLengths, calculated);
    }
}