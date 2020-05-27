public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    public Language(String languageName, int totalLangSpeakers, String langRegion, String orderOfWords) {
        System.out.println("");
        this.name = languageName;
        this.numSpeakers = totalLangSpeakers;
        this.regionSpoken = langRegion;
        this.wordOrder = orderOfWords;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.name + " people mainly in " + this.regionSpoken
                + ".\nThe language follows the word order: " + this.wordOrder);
        System.out.println("");
    }

    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea",
                "subject-verb-object");
        spanish.getInfo();

        Mayan chontal = new Mayan("Chontal", 36810);
        chontal.getInfo();

        SinoTibetan chinese = new SinoTibetan("Chinese", 1300000000);
        chinese.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        burmese.getInfo();
    }
}