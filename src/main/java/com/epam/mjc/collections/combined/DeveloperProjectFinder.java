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

        Collections.reverse(findDeveloperProject);
        return findDeveloperProject;
    }

    public static class FindDeveloperProjectComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.compareTo(o2) == 1) {
                return 0;
            } else if (o1.compareTo(o2) != 1) {
                return 1;
            }
            return o1.compareTo(o2);
        }
    }
}
