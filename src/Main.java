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

String[] bannerLines = new String[5];

for (int i = 0; i < 5; i++) {

    StringBuilder rowBuilder = new StringBuilder();

    for (char c : word.toCharArray()) {
        if (letterMap.containsKey(c)) {
            rowBuilder.append(letterMap.get(c).getRow(i)).append(" ");
        }
    }

    bannerLines[i] = rowBuilder.toString();
}

// Print using enhanced for-loop
for (String line : bannerLines) {
    System.out.println(line);
}
    }
}