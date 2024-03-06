package edu.canisius.cyb.cyb600.lab2;

import edu.canisius.cyb.cyb600.lab2.exceptions.NotADogException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    /**
     * Converts a string to a list of characters.
     *
     * @param stringToList The input string to convert to a list of characters.
     * @return A list of characters representing the input string.
     */
    public List<Character> listAllCharacters(String stringToList) {
        // Return an empty list if input is null
        if (stringToList == null) {
            return new ArrayList<>();
        }

        List<Character> characterList = new ArrayList<>();

        // Convert each character in the string to a list element
        for (char c : stringToList.toCharArray()) {
            characterList.add(c);
        }

        return characterList;
    }

    /**
     * Concatenates the given base string with another string at the front and end.
     *
     * @param baseString The base string.
     * @param concat The string to concatenate to the front and end of the base string.
     * @return The concatenated string.
     */
    public String concatenateToFrontAndEnd(String baseString, String concat) {
        // Check for null values and handle accordingly
        baseString = (baseString != null) ? baseString : "";
        concat = (concat != null) ? concat : "";

        return concat + baseString + concat;
    }

    /**
     * Throws a NotADogException if the input string is not "dog" (case-insensitive).
     *
     * @param betterBeDog The input string to check.
     * @throws NotADogException Thrown if the input string is not "dog".
     */
    public void throwExceptionIfNotADog(String betterBeDog) throws NotADogException {
        if (betterBeDog == null || !betterBeDog.equalsIgnoreCase("dog")) {
            throw new NotADogException("This isn't a dog.");
        }
    }

    /**
     * Returns a list containing the same string repeated ten times.
     *
     * @param baseString The string to be repeated.
     * @return A list containing the repeated string.
     */
    public List<String> returnsTheSameStringTenTimes(String baseString) {
        List<String> arrayList = new ArrayList<>();

        // Return an empty list if the base string is null
        if (baseString == null) {
            return arrayList;
        }

        // Repeat the base string and add to the list until it has 10 elements
        while (arrayList.size() < 10) {
            arrayList.add(baseString);
        }

        return arrayList;
    }
}
