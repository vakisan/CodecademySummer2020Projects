public class Mayan extends Language {

    public Mayan(String languageName, int totalLangSpeakers) {
        super(languageName, totalLangSpeakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.name + " people mainly in " + this.regionSpoken
                + ".\nThe language follows the word order: " + this.wordOrder + "\nFun fact: " + this.name
                + " is an ergative language.");
    }

}