package com.epam.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumberWithPositive() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("1"));
    }

    @Test
    void isPositiveNumberWithNegative() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("-1"));
    }

    @Test
    void isPositiveNumberWithNull() {
        Assertions.assertFalse(StringUtils.isPositiveNumber(null));
    }

    @Test
    void isPositiveNumberWithEmptyString() {
        Assertions.assertFalse(StringUtils.isPositiveNumber(" "));
    }
}