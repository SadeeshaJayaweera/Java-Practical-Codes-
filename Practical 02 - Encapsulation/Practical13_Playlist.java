/**
 * Practical 13: Encapsulating a Collection (Defensive Copy)
 * 
 * Concept: Returning an internal mutable collection directly breaks encapsulation; return a copy or unmodifiable view instead.
 * 
 * Question: Build a `Playlist` class that safely exposes its song list.
 * 
 * Sample Output:
 * Songs: [Blinding Lights, Levitating]
Cannot modify playlist from outside: UnsupportedOperationException
 */

import java.util.*;

public class Playlist {
    private final List<String> songs = new ArrayList<>();

    public void addSong(String song) { songs.add(song); }

    public List<String> getSongs() {
        return Collections.unmodifiableList(new ArrayList<>(songs));
    }

    public static void main(String[] args) {
        Playlist pl = new Playlist();
        pl.addSong("Blinding Lights");
        pl.addSong("Levitating");

        List<String> exposed = pl.getSongs();
        System.out.println("Songs: " + exposed);
        try {
            exposed.add("Hacked Song");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify playlist from outside: " + e.getClass().getSimpleName());
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why wrap the list with `Collections.unmodifiableList`? A: To prevent external code from mutating the class's internal state through the returned reference.
 * 2. Q: What exception is thrown when modifying an unmodifiable collection? A: `UnsupportedOperationException`.
 */
