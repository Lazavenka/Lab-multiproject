package com.epam.lazavenka.api;

import com.epam.lazavenka.core.Utils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        String[] stringArrayToTest = args.length == 0 ? new String[]{"12", "79"} : args;
        boolean isPositiveNumbers = Utils.isAllPositiveNumbers(stringArrayToTest);
        LOGGER.log(Level.INFO, "Test result for array {} is {}", stringArrayToTest, isPositiveNumbers);
    }
}
