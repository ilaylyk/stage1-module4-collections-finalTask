package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> findDeveloperProject = new ArrayList<>();

        for(String person : projects.keySet()){
            for (String pet : projects.get(person)){
                if (Objects.equals(pet, developer)){
                    findDeveloperProject.add(person);
                }
            }
        }
        Collections.reverse(findDeveloperProject);
        return findDeveloperProject;
    }
}
