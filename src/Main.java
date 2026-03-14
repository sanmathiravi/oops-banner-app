public class Main {

    public static void renderBanner(String word) {

        for (int i = 0; i < 5; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(CharacterPattern.getPatternRow(c, i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";
        renderBanner(word);

    }
}