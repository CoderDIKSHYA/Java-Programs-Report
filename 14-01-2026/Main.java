package FileHandling;

import java.util.LinkedHashSet;
import java.util.Set;

// ================= PLAYLIST CLASS =================
class Playlist {

    private String playlistName;
    private Set<String> songs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songs = new LinkedHashSet<>(); // Maintains insertion order
    }

    // Add Song
    public void addSong(String song) {
        if (songs.add(song)) {
            System.out.println(song + " added to " + playlistName + " playlist.");
        } else {
            System.out.println(song + " is already in the playlist!");
        }
    }

    // Remove Song
    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println(song + " removed from " + playlistName + " playlist.");
        } else {
            System.out.println(song + " is not in the playlist.");
        }
    }

    // Display Playlist
    public void displayPlaylist() {
        System.out.println("Playlist: " + playlistName);
        for (String song : songs) {
            System.out.println(" - " + song);
        }
    }

    // Check Song
    public void checkSong(String song) {
        if (songs.contains(song)) {
            System.out.println(song + " is in the playlist.");
        } else {
            System.out.println(song + " is not in the playlist.");
        }
    }
}


// ================= DRIVER CLASS =================
public class Main {

    public static void main(String[] args) {

        Playlist myPlaylist = new Playlist("My Favorites");

        myPlaylist.addSong("Shape of You");
        myPlaylist.addSong("Blinding Lights");
        myPlaylist.addSong("Shape of You");  // Duplicate

        myPlaylist.displayPlaylist();

        myPlaylist.removeSong("Blinding Lights");

        myPlaylist.displayPlaylist();
    }
}
