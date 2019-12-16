package com.github.curriculeon.simplephonebook;

import com.github.curriculeon.SimplePhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class AddTest {
    // given
    private void test(String name, String phoneNumberToAdd) {
        SimplePhoneBook phoneBook = new SimplePhoneBook();

        // when
        phoneBook.add(name, phoneNumberToAdd);

        // then
        String actualPhoneNumber = phoneBook.get(name);
        Assert.assertEquals(phoneNumberToAdd, actualPhoneNumber);
    }

    @Test
    public void test0() {
        test("Leon", "302-555-5555");
    }

    @Test
    public void test1() {
        test("Ali", "302-555-5554");
    }

    @Test
    public void test2() {
        test("Bezawit", "302-555-5553");
    }

    @Test
    public void test3() {
        test("Lenny", "302-555-5552");
    }
}
