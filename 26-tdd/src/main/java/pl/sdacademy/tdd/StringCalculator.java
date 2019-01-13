package pl.sdacademy.tdd;

import java.util.stream.Stream;

public class StringCalculator {
        public static int add(String inputNumbers) {
                if (inputNumbers.isEmpty()) {
                        return 0;
                }
                String[] numbers = extractNumbers(inputNumbers);
                return Stream.of(numbers).mapToInt(Integer::parseInt).sum();
        }

        private static String[] extractNumbers(String inputNumbers) {
                String[] numbers;
                if (inputNumbers.startsWith("//")) {
                        char sep = inputNumbers.charAt(2);
                        numbers = inputNumbers.substring(4).split(Character.toString(sep));
                } else {
                        numbers = inputNumbers.split("\n|,");
                }
                return numbers;
        }

}


