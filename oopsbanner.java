public class oopsbanner {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Array to store final banner lines
        String[] banner = new String[7];

        // Combine the letters line by line
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", o[i], o[i], p[i], s[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for letter O
    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
    }
}