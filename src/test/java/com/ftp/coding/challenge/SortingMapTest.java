package com.ftp.coding.challenge;

import com.ftp.coding.challenge.singleton.ThreadSafeSingleton;
import com.ftp.coding.challenge.sorting.SortingMap;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SortingMapTest {

    @Test
    public void testSortMapByValue() {
        SortingMap sortingMap = new SortingMap();

        /** Sample data */
        Map<Integer, String> mapEntries = new HashMap<>();
        mapEntries.put(2, "Testing 2");
        mapEntries.put(1 , "Testing 1");
        mapEntries.put(5, "Testing 5");
        mapEntries.put(4, "Testing 4");
        mapEntries.put(3, "Testing 3");

        /** Assert the total size of the the map */
        assertTrue(sortingMap.sortMapByValue(mapEntries).size() == 5);

        /** Sort and print the sorted key and values */
        Map<Integer, String> sortedMapEntries = sortingMap.sortMapByValue(mapEntries);
        sortedMapEntries.entrySet().stream().forEach(x -> System.out.println("key=" + x.getKey() + " value=" + x.getValue()));
    }
}
