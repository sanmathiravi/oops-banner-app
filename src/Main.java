public class Main {

    public static void main(String[] args) {

        String word = "OOPS";

        for (int i = 0; i < 5; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(CharacterPattern.getRow(c, i) + " ");
            }
            System.out.println();
        }

    }
}