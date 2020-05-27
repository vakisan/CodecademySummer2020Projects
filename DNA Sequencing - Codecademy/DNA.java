public class DNA {

    /*
     * Revised String methods from Stringg class
     * 
     * CodecademyPro Portfolio
     * 
     * This program simulates basic DNA Sequencing
     * 
     * Author Vakisan Manoharan
     * 
     * Summer Project 2020
     * 
     * Project Date: 26/05/2020
     */
    public static void checkDNA(String dnaSequence) {
        if (dnaSequence.indexOf("ATG") != -1) {
            String dna = dnaSequence.substring(dnaSequence.indexOf("ATG"));
            if ((dna.substring(dna.length() - 3)).equals("TGA")) {
                if (dna.length() % 3 == 0) {
                    System.out.println("This sequence contains a protein");
                } else {
                    System.out.println("This sequence does not contain a protein");
                }
            } else {
                System.out.println("This sequence does not contain a protein");
            }
        } else {
            System.out.println("This sequence does not contain a protein");
        }
    }

    public static void main(String[] args) {

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        checkDNA(dna1);
        checkDNA(dna2);
        checkDNA(dna3);

    }

}