package com.github.curriculeon;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class AdvancedPhoneBook {
    private Map<String, List<String>> phonebook = new HashMap<>();

    public AdvancedPhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public AdvancedPhoneBook() {

    }

    public void add(String name, String phoneNumber) {

    }

    public void addAll(String name, String... phoneNumbers) {
    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}
