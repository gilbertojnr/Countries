package com.company;

/**
 * Created by gilbertakpan on 11/28/16.
 */
public class Country {
    String name;
    String abbreviation;

    public Country(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return "Country{" + "name:'" + name + '\'' + ", abbreviation:" + abbreviation + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
