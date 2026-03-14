public class BannerLetter {

    private String[] pattern;

    public BannerLetter(String[] pattern) {
        this.pattern = pattern;
    }
public String getRow(int index){
return pattern[index];
}

    public String getRow(int index) {
        return pattern[index];
    }

    public void print() {
        for (String line : pattern) {
            System.out.println(line);
        }
    }
}