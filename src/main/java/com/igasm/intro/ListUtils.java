package com.igasm.intro;

import java.util.List;

public class ListUtils {

    public static <T> T lastEntry(List<T> listOfEntries){
        if(listOfEntries.isEmpty()){
            throw new RuntimeException("List is empty");
        }
        return listOfEntries.get(listOfEntries.size()-1);
    }

    public static <T> T lastEntry(T[] arrayOfEntries){
        if(arrayOfEntries.length == 0){
            throw new RuntimeException("array is empty");
        }
        return arrayOfEntries[arrayOfEntries.length-1];
    }

}
