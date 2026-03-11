/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize the array in a single statement
        String[] lines = {
            String.join("   ", " *** ", " *** ", " **** ", " **** "),
            String.join("   ", "*   *", "*   *", "*   *", "*     "),
            String.join("   ", "*   *", "*   *", "*   *", "*     "),
            String.join("   ", "*   *", "*   *", " **** ", " ***  "),
            String.join("   ", "*   *", "*   *", "*     ", "    * "),
            String.join("   ", "*   *", "*   *", "*     ", "*   * "),
            String.join("   ", " *** ", " *** ", "*     ", " ***  ")
        };

        // Use enhanced for loop to print the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}