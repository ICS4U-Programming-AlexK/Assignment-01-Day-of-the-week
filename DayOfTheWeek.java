import java.util.Scanner;

/**
 * @author  Alex Kapajika
 * @version 1.0
 * @since   2025-02-25
 */

final class DayOfTheWeek {
    /**
     * Input.
     */
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
                if (number < 1 || number > 7) {
                    System.out.println("Error, Only numbers between 1 and 7: ");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid,Enter a number between 1 and 7: ");
            }
        }
        String weekday;
        if (number == 1) {
            weekday = "Monday";
        } else if (number == 2) {
            weekday = "Tuesday";
        } else if (number == 3) {
            weekday = "Wednesday";
        } else if (number == 4) {
            weekday = "Thursday";
        } else if (number == 5) {
            weekday = "Friday";
        } else if (number == 6) {
            weekday = "Saturday";
        } else {
            weekday = "Sunday";
        }
        System.out.println("The day is: " + weekday);
    }
}
