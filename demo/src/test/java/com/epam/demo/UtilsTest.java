package com.epam.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbersWithTrue() {
        List<String> trueList = Arrays.asList("1", "2", "11.22");
        Assertions.assertTrue(Utils.isAllPositiveNumbers(trueList));
    }

    @Test
    void isAllPositiveNumbersWithFalse() {
        List<String> falseList = Arrays.asList("1", "2", "-4.2");
        Assertions.assertFalse(Utils.isAllPositiveNumbers(falseList));
    }

    @Test
    void isAllPositiveNumbersWithFalse2() {
        List<String> falseList = Arrays.asList("1", "2", "null");
        Assertions.assertFalse(Utils.isAllPositiveNumbers(falseList));
    }

    @Test
    void isAllPositiveNumbersWithEmptyString() {
        List<String> falseList = Arrays.asList("1", "2", " ");
        Assertions.assertFalse(Utils.isAllPositiveNumbers(falseList));
    }

    @Test
    void isAllPositiveNumbersWithEmptyString2() {
        List<String> falseList = Arrays.asList("1", "2", "");
        Assertions.assertFalse(Utils.isAllPositiveNumbers(falseList));
    }

    @Test
    void isAllPositiveNumbersWithNull() {
        List<String> falseList = null;
        Assertions.assertFalse(Utils.isAllPositiveNumbers(null));
    }
}