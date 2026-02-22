import java.util.ArrayList;
import java.util.List;
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

        for (int i = 0; i < 5; i++) {

    List<String> rowParts = new ArrayList<>();

    for (char c : word.toCharArray()) {
        if (letterMap.containsKey(c)) {
            rowParts.add(letterMap.get(c).getRow(i));
        }
    }

    System.out.println(String.join("   ", rowParts));
}
}
}