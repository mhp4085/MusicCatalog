/**
 * @author Crescendo Revolution Team
 * boomPad.sortBy class includes information on sorting through the music database
 */

package boompad;

import java.util.Comparator;
import java.util.List;

public class sortBy {
     // ============================================================ Methods
     /**
     * Sorts by artist
     * 
     * @return songlist a List of sorted songs by artist
     */
    public static List<song> byArtist(List<song> songlist){
        songlist.sort(new Comparator<song>() {
            @Override
            public int compare(song o1, song o2) {
                if (o1.song_artist.compareTo(o2.song_artist) == 0) {
                    if (o1.song_name.compareTo(o2.song_name) < 0) {
                        return -1;
                    } else if (o1.song_name.compareTo(o2.song_name) > 0) {
                        return 1;
                    }
                    return 0;
                } else if (o1.song_artist.compareTo(o2.song_artist) < 0) {
                    System.out.println(o1.song_artist + " < " + o2.song_artist);
                    return -1;
                } else {
                    System.out.println(o1.song_artist + " > " + o2.song_artist);
                    return 1;
                }
            }
        });
        return songlist;
    }

     /**
     * Sorts by song name
     * 
     * @return songlist a List of sorted songs by song name
     */
    public static List<song> byName(List<song> songlist){
        songlist.sort(new Comparator<song>() {
            @Override
            public int compare(song o1, song o2) {
                if (o1.song_name.compareTo(o2.song_name) == 0) {
                    if (o1.song_artist.compareTo(o2.song_artist) < 0) {
                        return -1;
                    } else if (o1.song_artist.compareTo(o2.song_artist) > 0) {
                        return 1;
                    }
                    return 0;
                } else if (o1.song_name.compareTo(o2.song_name) < 0) {
                    System.out.println(o1.song_name + " < " + o2.song_name);
                    return -1;
                } else {
                    System.out.println(o1.song_name + " > " + o2.song_name);
                    return 1;
                }
            }
        });
        return songlist;
    }

     /**
     * Sorts by year
     * 
     * @return songlist a List of sorted songs by yeaar
     */
    public static List<song> byYear(List<song> songlist){
        songlist.sort(new Comparator<song>() {
            @Override
            public int compare(song o1, song o2) {
                if (o1.song_year.compareTo(o2.song_year) == 0) {
                    if (o1.song_name.compareTo(o2.song_name) < 0) {
                        return -1;
                    } else if (o1.song_name.compareTo(o2.song_name) > 0) {
                        return 1;
                    }
                    return 0;
                } else if (o1.song_year.compareTo(o2.song_year) < 0) {
                    System.out.println(o1.song_year + " < " + o2.song_year);
                    return -1;
                } else {
                    System.out.println(o1.song_year + " > " + o2.song_year);
                    return 1;
                }
            }
        });
        return songlist;
    }

    /**
     * sort by year
     * @param songlist list
     * @return list
     */
    public static List<song> byYearBack(List<song> songlist){
        songlist.sort(new Comparator<song>() {
            @Override
            public int compare(song o1, song o2) {
                if (o1.song_year.compareTo(o2.song_year) == 0) {
                    if (o1.song_name.compareTo(o2.song_name) < 0) {
                        return 1;
                    } else if (o1.song_name.compareTo(o2.song_name) > 0) {
                        return -1;
                    }
                    return 0;
                } else if (o1.song_year.compareTo(o2.song_year) < 0) {
                    System.out.println(o1.song_year + " < " + o2.song_year);
                    return 1;
                } else {
                    System.out.println(o1.song_year + " > " + o2.song_year);
                    return -1;
                }
            }
        });
        return songlist;
    }

    /**
     * sort by album
     * @param songlist list
     * @return list
     */
    public static List<song> byAlbum(List<song> songlist){
        songlist.sort(new Comparator<song>() {
            @Override
            public int compare(song o1, song o2) {
                if (o1.song_album.compareTo(o2.song_album) == 0) {
                    if (o1.song_name.compareTo(o2.song_name) < 0) {
                        return -1;
                    } else if (o1.song_name.compareTo(o2.song_name) > 0) {
                        return 1;
                    }
                    return 0;
                } else if (o1.song_album.compareTo(o2.song_album) < 0) {
                    System.out.println(o1.song_album + " < " + o2.song_album);
                    return -1;
                } else {
                    System.out.println(o1.song_album + " > " + o2.song_album);
                    return 1;
                }
            }
        });
        return songlist;
    }

     /**
     * Sorts by song length
     * 
     * @return songlist a List of sorted songs by song length
     */
    public static List<song> bySongLength(List<song> songlist){
        songlist.sort(new Comparator<song>() {
            @Override
            public int compare(song o1, song o2) {
                if (o1.song_length.compareTo(o2.song_length) == 0) {
                    if (o1.song_name.compareTo(o2.song_name) < 0) {
                        return -1;
                    } else if (o1.song_name.compareTo(o2.song_name) > 0) {
                        return 1;
                    }
                    return 0;
                } else if (o1.song_length.compareTo(o2.song_length) < 0) {
                    System.out.println(o1.song_length + " < " + o2.song_length);
                    return -1;
                } else {
                    System.out.println(o1.song_length + " > " + o2.song_length);
                    return 1;
                }
            }
        });
        return songlist;
    }

     /**
     * Sorts by producer
     * 
     * @return songlist a List of sorted songs by producer
     */
    public static List<song> byProducer(List<song> songlist){
        songlist.sort(new Comparator<song>() {
            @Override
            public int compare(song o1, song o2) {
                if (o1.song_producer.compareTo(o2.song_producer) == 0) {
                    if (o1.song_name.compareTo(o2.song_name) < 0) {
                        return -1;
                    } else if (o1.song_name.compareTo(o2.song_name) > 0) {
                        return 1;
                    }
                    return 0;
                } else if (o1.song_producer.compareTo(o2.song_producer) < 0) {
                    System.out.println(o1.song_producer + " < " + o2.song_producer);
                    return -1;
                } else {
                    System.out.println(o1.song_producer + " > " + o2.song_producer);
                    return 1;
                }
            }
        });
        return songlist;
    }
     /**
     * Sorts by genre
     * 
     * @return songlist a List of sorted songs by genre
     */
    public static List<song> byGenre(List<song> songlist){
        songlist.sort(new Comparator<song>() {
            @Override
            public int compare(song o1, song o2) {
                if (o1.song_genre.compareTo(o2.song_genre) == 0) {
                    if (o1.song_name.compareTo(o2.song_name) < 0) {
                        return -1;
                    } else if (o1.song_name.compareTo(o2.song_name) > 0) {
                        return 1;
                    }
                    return 0;
                } else if (o1.song_genre.compareTo(o2.song_genre) < 0) {
                    System.out.println(o1.song_genre + " < " + o2.song_genre);
                    return -1;
                } else {
                    System.out.println(o1.song_genre + " > " + o2.song_genre);
                    return 1;
                }
            }
        });
        return songlist;
    }
}
