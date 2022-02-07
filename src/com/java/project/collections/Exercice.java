package com.java.project.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercice {

    public static void main(String[] args) {
        System.out.println("## Question a\n");
        List<Country> countryList = populateCountries();

        System.out.println("La collection créée contient " + countryList.size() + " pays !");

        System.out.println("## Question b\n");
        displayCountries(countryList);

        System.out.println("## Question c\n");
        countryList.clear();
        displayCountries(countryList);

        System.out.println("## Question d\n");
        countryList = populateCountries();
        Country lastCountry = countryList.get(countryList.size() - 1);
        lastCountry.setName("Espagne");
        displayCountries(countryList);

        System.out.println("## Question e\n");
//        List<String> countries = new ArrayList<>();
//        countries.add("FRANCE");
//        countries.add("BELGIQUE");
//        Collections.sort(countries, Collections.reverseOrder());

        Collections.sort(countryList, new CountryComparator());
        displayCountries(countryList);

        System.out.println("## Question f\n");
        Collections.sort(countryList, new Comparator<Country>() {
            @Override
            public int compare(Country c1, Country c2) {
                return Integer.compare(c1.getName().length(), c2.getName().length());
            }
        });

        Comparator<Country> myComparator = (c1, c2) -> Integer.compare(c1.getName().length(), c2.getName().length());
        Collections.sort(countryList, myComparator);

        Collections.sort(countryList, Comparator.comparing(country -> country.getName()));
    }

    private static List<Country> populateCountries() {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("France"));
        countryList.add(new Country("Allemagne"));
        countryList.add(new Country("Belgique"));
        countryList.add(new Country("Portugal"));
        return countryList;
    }

    private static void displayCountries(List<Country> countryList) {
        if (countryList.isEmpty()) {
            System.out.println("Liste vide");
        }
        for (Country c : countryList) {
            System.out.println(c.getName());
        }
    }


}
