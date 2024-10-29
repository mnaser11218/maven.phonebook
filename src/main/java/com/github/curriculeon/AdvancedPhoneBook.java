package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class AdvancedPhoneBook {
    private Map<String, List<String>> phonebook = new LinkedHashMap<>();

    public AdvancedPhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public AdvancedPhoneBook() {

    }

    public void add(String name, String phoneNumber) {
        List<String> singleNum = new ArrayList<>();
        singleNum.add(phoneNumber);
        this.phonebook.put(name,singleNum);
    }

    public void addAll(String name, String... phoneNumbers) {
        this.phonebook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        String results = "";
        for(Map.Entry<String, List<String>> num : this.phonebook.entrySet()){
            if(num.getValue().get(0).equals(name)){
                return true;
            }
        }
        return false;
    }

    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String results = "";
        for(Map.Entry<String, List<String>> num : this.phonebook.entrySet()){
            if(num.getValue().get(0).equals(phoneNumber)){
                return num.getKey();
            }
           // System.out.println("val: " + num.getValue().get(0));
        }
        return null;
    }

    public List<String> getAllContactNames() {
        List<String> keysList = new LinkedList<>(this.phonebook.keySet());

        return keysList;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}
