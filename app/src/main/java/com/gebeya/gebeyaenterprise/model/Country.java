package com.gebeya.gebeyaenterprise.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by dave-5cof on 1/27/17.
 */

public class Country {

    private static ArrayList<Country> countries;

    public static void addCountries(ArrayList<Country> newCountries) {
        if (countries == null) {
            countries = new ArrayList<>();
        }
        if (countries.isEmpty()) {
            countries.addAll(newCountries);
        }
    }

    public ArrayList<String> cities;

    public Country() {
        cities = new ArrayList<>();
    }
}
