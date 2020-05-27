public class SinoTibetan extends Language {

    public SinoTibetan(String languageName, int totalLangSpeakers) {
        // super must be the first statement.. if cannot be used above
        super(languageName, totalLangSpeakers, "Asia", "subject-object-verb");
        if (this.name.contains("Chinese") || languageName.contains("chinese")) {
            // cannot call super again
            this.wordOrder = "subject-verb-object";
        }
    }
}
