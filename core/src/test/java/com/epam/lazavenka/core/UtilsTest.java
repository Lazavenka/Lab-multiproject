package com.epam.lazavenka.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @ParameterizedTest
    @MethodSource("incorrectDataProvider")
    void isAllPositiveNumbersShouldReturnFalse(String... strings) {
        assertFalse(Utils.isAllPositiveNumbers(strings));
    }

    @ParameterizedTest
    @MethodSource("correctDataProvider")
    void isAllPositiveNumbersShouldReturnTrue(String... strings) {
        assertTrue(Utils.isAllPositiveNumbers(strings));
    }

    @ParameterizedTest
    @NullSource
    void isAllPositiveNumbersNullArgument(String... strings) {
        assertFalse(Utils.isAllPositiveNumbers(strings));
    }

    private static Stream<Arguments> incorrectDataProvider() {
        return Stream.of(
                Arguments.of((Object) new String[]{"", " ", "2"}),
                Arguments.of((Object) new String[]{"45", null, "2"}),
                Arguments.of((Object) new String[]{"2.5", " ", "2"}),
                Arguments.of((Object) new String[]{"34555", "number", "29999"}),
                Arguments.of((Object) new String[]{"-233", "0", "2"}),
                Arguments.of((Object) new String[]{"e233"}),
                Arguments.of((Object) new String[]{"233", " ", "2", "g4", "2.4", "2"}),
                Arguments.of((Object) new String[]{}),
                Arguments.of((Object) new String[]{null, null, null}));
    }

    private static Stream<Arguments> correctDataProvider() {
        return Stream.of(
                Arguments.of((Object) new String[]{"1", "2", "3"}),
                Arguments.of((Object) new String[]{"45"}),
                Arguments.of((Object) new String[]{"25", "2"}),
                Arguments.of((Object) new String[]{"12", "79"}),
                Arguments.of((Object) new String[]{"233", "0", "2", "12", "79", "124", "799999999999999"}),
                Arguments.of((Object) new String[]{"233", "55", "2"}));
    }
}