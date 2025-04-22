package easyTask;

import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedHashSet<String> playlist = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("🎵 Enter song name (or 'exit' to stop): ");
            String song = sc.nextLine();

            if (song.equalsIgnoreCase("exit")) break;

            if (playlist.size() >= 5) {
                String firstSong = playlist.iterator().next();
                playlist.remove(firstSong);
                System.out.println("🗑️ Removed oldest song: " + firstSong);
            }

            if (playlist.add(song)) {
                System.out.println("✅ Added to playlist: " + song);
            } else {
                System.out.println("⚠️ Duplicate! Song already in playlist.");
            }

            System.out.println("🎧 Current Playlist: " + playlist + "\n");
        }

        System.out.println("🎶 Final Playlist: " + playlist);
    }
}
