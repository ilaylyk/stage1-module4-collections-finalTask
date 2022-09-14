package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> findDeveloperProject = new ArrayList<>();

        for (String projectsDeveloper : projects.keySet()) {
            for (String pet : projects.get(projectsDeveloper)) {
                if (Objects.equals(pet, developer)) {
                    findDeveloperProject.add(projectsDeveloper);
                }
            }
        }
        Comparator<String> stringComparator = new FindDeveloperProjectComparator();
        findDeveloperProject.sort(stringComparator);

        return findDeveloperProject;
    }


    public static class FindDeveloperProjectComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int count = 0;
            for (int i = 0; i < o1.length(); i++) {
                count++;
            }
            int count_o2 = 0;
            for (int i = 0; i < o2.length(); i++) {
                count_o2++;
            }
            if (count == count_o2) {
                return o2.compareTo(o1);
            } else if (count > count_o2) {
                return o1.compareTo(o2);
            } else {
                return 1;
            }
        }
    }
}

