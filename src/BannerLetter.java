public class BannerLetter {

    private String[] pattern;

    public BannerLetter(String[] pattern) {
        this.pattern = pattern;
    }

    public void print() {
        for (String line : pattern) {
            System.out.println(line);
        }
    }
}