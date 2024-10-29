package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {
    private Map<String, String> phonebook = new LinkedHashMap<>();
    public void add(String name, String phoneNumberToAdd) {
        this.phonebook.put(name, phoneNumberToAdd);

    }

    public String get(String name) {
        return this.phonebook.get(name);
    }

    public Boolean hasEntry(String phoneNumber) {
        return this.phonebook.containsValue(phoneNumber) ;
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public List<String> getAllContactNames() {
        List<String>results = new ArrayList<>();
        for(Map.Entry<String, String> number : this.phonebook.entrySet()){
          results.add(number.getKey());
        }
        return results;
    }

    public String reverseLookup(String phoneNumber) {

        for (Map.Entry<String, String> num : this.phonebook.entrySet()) {
            if (num.getValue().equals(phoneNumber)) {
                return num.getKey();
            }
        }
        return null;
    }

}
