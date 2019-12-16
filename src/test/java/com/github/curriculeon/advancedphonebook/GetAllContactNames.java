package com.github.curriculeon.advancedphonebook;

import com.github.curriculeon.AdvancedPhoneBook;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GetAllContactNames {
    @Test
    public void test1() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String[] names = new String[]{"John", "Joe", "Jim", "Jay"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            advancedPhoneBook.add(name, "");
        }

        // when
        List<String> actualNames = advancedPhoneBook.getAllContactNames();

        // then
        Assert.assertEquals(Arrays.asList(names), actualNames);
    }

    @Test
    public void test2() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String[] names = new String[]{"Chris", "Christian", "Christopher", "Christina"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            advancedPhoneBook.add(name, "");
        }

        // when
        List<String> actualNames = advancedPhoneBook.getAllContactNames();

        // then
        Assert.assertEquals(Arrays.asList(names), actualNames);
    }

    @Test
    public void test3() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String[] names = new String[]{"Ashley", "Aaron", "Albert", "Alfred"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            advancedPhoneBook.add(name, "");
        }

        // when
        List<String> actualNames = advancedPhoneBook.getAllContactNames();

        // then
        Assert.assertEquals(Arrays.asList(names), actualNames);
    }
}
