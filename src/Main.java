import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] pattern = {
                String.join("", "*","*","*","*","*"),
                String.join("", "*"," "," "," ","*"),
                String.join("", "*","*","*","*","*"),
                String.join("", "*"," "," "," ","*"),
                String.join("", "*"," "," "," ","*")
        };

        BannerLetter letter = new BannerLetter(pattern);
        letter.print();
    
    }

    System.out.println(String.join("   ", rowParts));
}
}
}