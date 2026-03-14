import java.util.HashMap;
import java.util.Map;

public class CharacterPattern {

    private static Map<Character, String[]> patternMap = new HashMap<>();

    static {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

    }

    public static String getRow(char c, int row) {
        if (patternMap.containsKey(c)) {
            return patternMap.get(c)[row];
        }
        return "       ";
    }
}