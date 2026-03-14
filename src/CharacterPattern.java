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

    public static String getPatternRow(char letter, int row) {
        return patternMap.get(letter)[row];
    }
}