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
}