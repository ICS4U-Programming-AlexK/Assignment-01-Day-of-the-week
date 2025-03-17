import java.util.Scanner;

/**
 * @author  Alex Kapajika
 * @version 1.0
 * @since   2025-02-25
 */

public final class DayOfTheWeek {
    /**Monday. */
    private static final int NUMBER_ONE = 1;
    /** Tuesday. */
    private static final int NUMBER_TWO = 2;
    /**  Wednesday. */
    private static final int NUMBER_THREE = 3;
    /**Thursday. */
    private static final int NUMBER_FOUR = 4;
    /**Friday. */
    private static final int NUMBER_FIVE = 5;
    /**Saturday. */
    private static final int NUMBER_SIX = 6;
    /**Sunday. */
    private static final int NUMBER_SEVEN = 7;
    private DayOfTheWeek() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * @param args Unused.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter a number between 1 and 7: ");
                number = Integer.parseInt(scanner.nextLine());
                if (number < NUMBER_ONE || number > NUMBER_SEVEN) {
                    System.out.println("Error, Only numbers between 1 and 7: ");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid,Enter a number between 1 and 7: ");
            }
        }
        String weekday;
        if (number == NUMBER_ONE) {
            weekday = "Monday";
        } else if (number == NUMBER_TWO) {
            weekday = "Tuesday";
        } else if (number == NUMBER_THREE) {
            weekday = "Wednesday";
        } else if (number == NUMBER_FOUR) {
            weekday = "Thursday";
        } else if (number == NUMBER_FIVE) {
            weekday = "Friday";
        } else if (number == NUMBER_SIX) {
            weekday = "Saturday";
        } else {
            weekday = "Sunday";
        }
        System.out.println("The day is: " + weekday);
    }
}
