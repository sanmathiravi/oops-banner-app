import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] getP() {
        return new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };
    }

    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        BannerLetter o = new BannerLetter(getO());
        BannerLetter p = new BannerLetter(getP());
        BannerLetter s = new BannerLetter(getS());

        o.print();
        o.print();
        p.print();
        s.print();
    }

    System.out.println(String.join("   ", rowParts));
}
}
}