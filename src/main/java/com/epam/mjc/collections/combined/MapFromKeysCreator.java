package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> createMap = new HashMap<>();
        Set<Map.Entry<String, Integer>> set = sourceMap.entrySet();
        for (Map.Entry<String, Integer> me : set) {
            int count = 0;
            for (int i = 0; i < me.getKey().length(); i++) {
                count++;
            }
            Set<String> s = createMap.computeIfAbsent(count, k -> new HashSet<>());
            s.add(me.getKey());
        }
        return createMap;
    }
}
