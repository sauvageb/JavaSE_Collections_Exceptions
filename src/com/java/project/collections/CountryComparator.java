package com.java.project.collections;

import java.util.Collections;
import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {

    @Override
    public int compare(Country c1, Country c2) {
        return c1.getName().compareToIgnoreCase(c2.getName());
    }

}
