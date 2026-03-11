public class OOPSBannerApp {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap getOPattern() {
        return new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
    }

    public static CharacterPatternMap getPPattern() {
        return new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });
    }

    public static CharacterPatternMap getSPattern() {
        return new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });
    }

    public static void main(String[] args) {

        CharacterPatternMap[] letters = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                line.append(letter.getPattern()[i]).append("   ");
            }

            System.out.println(line.toString());
        }
    }
}