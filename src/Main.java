import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Character, BannerLetter> letterMap = new HashMap<>();

        letterMap.put('O', new BannerLetter(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        letterMap.put('P', new BannerLetter(new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        letterMap.put('S', new BannerLetter(new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        for (char c : word.toCharArray()) {
            if (letterMap.containsKey(c)) {
                letterMap.get(c).print();
            }
        }
    }
}