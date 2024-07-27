package boompad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
    BoomPad driver file
 */

public class boompad {
    // ============================================================ Properties
	public static ArrayList<song> songs;
    public static void main(String[] args) {
        readfile();
    }

    // ============================================================ Methods
    // file read method
    public static ArrayList<song> readfile() {
        ArrayList<song> songs = new ArrayList<>();
        try {
            File f = new File("data.txt");
            Scanner sc = new Scanner(f);
            sc.nextLine();
            
            // read file and save in list
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] details = line.split(",");
                String song_name = details[0];
                String Song_id = details[1];
                String Song_artist = details[2];
                String Song_year = details[3];
                String Song_album = details[4];
                String Song_length = details[5];
                String Song_producer = details[6];
                String song_genre = details[7];
                song s = new song(song_name, Song_id, Song_artist, Song_year, Song_album, Song_length,
                        Song_producer, song_genre);
                songs.add(s);

            }

            for (song s : songs) {
                System.out.println(s.toString());
            }
            System.out.println("Test");
            System.out.println(" ");
            System.out.println("**********");
            System.out.println("sort by artist");
            System.out.println("**********");
            System.out.println(" ");
            sortBy.byArtist(songs);
            for (song s : songs) {
                System.out.println(s.toString());
            }

            System.out.println(" ");
            System.out.println("**********");
            System.out.println("sort by Name");
            System.out.println("**********");
            System.out.println(" ");
            sortBy.byName(songs);
            for (song s : songs) {
                System.out.println(s.toString());
            }

            System.out.println(" ");
            System.out.println("**********");
            System.out.println("sort by Year");
            System.out.println("**********");
            System.out.println(" ");
            sortBy.byYear(songs);
            for (song s : songs) {
                System.out.println(s.toString());
            }

            System.out.println(" ");
            System.out.println("**********");
            System.out.println("sort by Year Back");
            System.out.println("**********");
            System.out.println(" ");
            sortBy.byYearBack(songs);
            for (song s : songs) {
                System.out.println(s.toString());
            }

            System.out.println(" ");
            System.out.println("**********");
            System.out.println("sort by Album");
            System.out.println("**********");
            System.out.println(" ");
            sortBy.byAlbum(songs);
            for (song s : songs) {
                System.out.println(s.toString());
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return songs;
    }
}
