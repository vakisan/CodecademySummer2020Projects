import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>(6);
        desertIslandPlaylist.add("Call out my name");
        desertIslandPlaylist.add("Alone");
        desertIslandPlaylist.add("Wicked games");
        desertIslandPlaylist.add("Starboy");
        desertIslandPlaylist.add("Kissland");
        desertIslandPlaylist.add("The hills");

        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.remove("Alone");
        System.out.println(desertIslandPlaylist.size());
        String temp = desertIslandPlaylist.get(0);
        desertIslandPlaylist.set(0, desertIslandPlaylist.get(1));
        desertIslandPlaylist.set(1, temp);
        System.out.println(desertIslandPlaylist);
        // reorder with indexof
        int tempPosition1 = desertIslandPlaylist.indexOf("The hills");
        int tempPosition2 = desertIslandPlaylist.indexOf("Wicked games");
        desertIslandPlaylist.set(tempPosition1, "Wicked games");
        desertIslandPlaylist.set(tempPosition2, "The hills");
        System.out.println(desertIslandPlaylist);

    }
}