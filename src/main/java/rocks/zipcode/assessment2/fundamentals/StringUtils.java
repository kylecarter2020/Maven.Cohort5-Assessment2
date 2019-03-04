package rocks.zipcode.assessment2.fundamentals;

import rocks.zipcode.assessment2.generics.Shelter;
import rocks.zipcode.assessment2.generics.ageable.Dog;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String result = getPadding(amountOfPadding, stringToBePadded.length());
        return result + stringToBePadded;
    }

    private static String getPadding(int amountOfPadding, int length) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < amountOfPadding - length; i++) {
            result.append(" ");
        }
        return result.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String result = getPadding(amountOfPadding, stringToBePadded.length());
        return stringToBePadded + result;
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            result.append(stringToBeRepeated);
        }
        return result.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        return (string.matches("^[ A-Za-z]+$"));
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        return string.matches("[0-9]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        Shelter<Dog> dogShelter = new Shelter<>();
        dogShelter.add(new Dog());
        return string.matches("^[-/@#$%^&_+=()*!]+");

    }
}
