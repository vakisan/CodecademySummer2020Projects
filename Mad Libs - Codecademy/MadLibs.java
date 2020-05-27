public class MadLibs {
    /*
     * CodecademyPro Portfolio
     * 
     * This program generates a mad libbed story.
     * 
     * Author Vakisan Manoharan
     * 
     * Summer Project 2020
     * 
     * Project Date: 26/05/2020
     */
    public static void main(String[] args) {

        String name1 = "James";
        String adjective1 = "great";
        String adjective2 = "Beautiful";
        String noun1 = "fool";
        String noun2 = "shopping bags";
        String verb1 = "stomp";
        String noun3 = "wack-a-mole game";
        String noun4 = "animal";
        String adjective3 = "upset";
        String name2 = "his dragon friend";
        String place1 = "the store";
        String noun5 = "air";
        int number = 3000;
        String noun6 = "dragon";

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}