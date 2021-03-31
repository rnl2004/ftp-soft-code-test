package com.ftp.coding.challenge.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class SortingMap {

    /** This method will do the sorting computation for a certain map entries */
    public Map<Integer, String> sortMapByValue(Map<Integer, String> mapEntries) {

        Map<Integer, String> sortedMapByValues = mapEntries
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldVal, newVal) -> oldVal, LinkedHashMap::new));

        return sortedMapByValues;
    }
}
