package edu.canisius.cyb.cyb600.lab2;

public class Task2 {

    /**
     * Reverses and capitalizes the input string.
     *
     * @param input String
     * @return Reversed and capitalized string
     */
    public String method1(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder reversed = new StringBuilder(input).reverse();
        return reversed.toString().toUpperCase();
    }

    /**
     * Concatenates the first character of the input string to the front of the string.
     *
     * @param input String
     * @return String with the first character appended to the front
     */
    public String method2(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder(input);
        char firstChar = input.charAt(0);

        for (int i = 0; i < input.length(); i++) {
            result.insert(i, firstChar);
        }

        return result.toString();
    }

    /**
     * Reverses the words in a sentence.
     *
     * @param input String
     * @return String with words in reverse order
     */
    public String method3(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i > 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        reversedSentence.append(words[0]);
        return reversedSentence.toString();
    }
}
