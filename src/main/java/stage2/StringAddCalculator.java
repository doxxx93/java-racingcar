package stage2;

import java.util.Arrays;

public class StringAddCalculator {

    private static final String DEFAULT_DELIMITER_REGEX = "[,:]";
    private static final String CUSTOM_DELIMITER_INDICATOR = "//";
    private static final String CUSTOM_DELIMITER_SEPARATOR = "\n";

    public static int splitAndSum(String input) {
        if (isNullOrEmpty(input)) {
            return 0;
        }

        String[] numbers = split(input);
        return calculateSum(numbers);
    }

    private static boolean isNullOrEmpty(String input) {
        return input == null || input.isEmpty();
    }

    private static String[] split(String input) {
        return hasCustomDelimiter(input)
                ? splitUsingCustomDelimiter(input)
                : splitUsingDefaultDelimiter(input);
    }

    private static boolean hasCustomDelimiter(String input) {
        return input.startsWith(CUSTOM_DELIMITER_INDICATOR);
    }

    private static String[] splitUsingDefaultDelimiter(String input) {
        return input.split(DEFAULT_DELIMITER_REGEX);
    }

    private static String[] splitUsingCustomDelimiter(String input) {
        String customDelimiter = input.substring(2, input.indexOf(CUSTOM_DELIMITER_SEPARATOR));
        String numbersPart = input.substring(input.indexOf(CUSTOM_DELIMITER_SEPARATOR) + 1);

        return numbersPart.split(customDelimiter);
    }

    private static int calculateSum(String[] numbers) {
        return Arrays.stream(numbers)
                .mapToInt(StringAddCalculator::parsePositiveNumber)
                .sum();
    }

    private static int parsePositiveNumber(String numberStr) {
        int number = Integer.parseInt(numberStr);

        if (number < 0) {
            throw new RuntimeException();
        }

        return number;
    }
}
