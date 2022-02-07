package com.java.project.collections;

import java.util.Comparator;

public class Country implements Comparable<Country> {

    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Country c) {
        return this.name.compareToIgnoreCase(c.getName());
    }

    public static class CountryComparator implements Comparator<Country> {

        @Override
        public int compare(Country c1, Country c2) {
            return c1.getName().compareToIgnoreCase(c2.getName());
        }

    }
}
