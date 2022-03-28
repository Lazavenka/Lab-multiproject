package com.epam.lazavenka.core;

import com.epam.lazavenka.utils.StringUtils;

import java.util.Arrays;

/**
 *
 * First module multi-project utils class
 * @author Lazavenka
 *
 */
public class Utils {
    /**
     * Checks if array of strings represents by only positive numbers.
     *
     * null will return false. An empty array (<code>length() == 0</code>) will return false
     *
     * @param     str strings array to test
     * @return    true if array consist of only positive number string representations
     * @see       com.epam.lazavenka.utils.StringUtils#isPositiveNumber(String)
     */
    public static boolean isAllPositiveNumbers(String... str){
        return str != null && str.length > 0 && Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
