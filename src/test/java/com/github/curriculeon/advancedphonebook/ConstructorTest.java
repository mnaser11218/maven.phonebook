package com.github.curriculeon.advancedphonebook;

import com.github.curriculeon.AdvancedPhoneBook;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstructorTest {
    @Test
    public void testNullaryConstructor() {
        // given
        // when
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();

        // then
        Assert.assertTrue(advancedPhoneBook.getMap() instanceof Map);
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        Map<String, List<String>> dependency = new HashMap<>();

        // when
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook(dependency);

        // then
        Assert.assertEquals(dependency, advancedPhoneBook.getMap());
    }
}
