import java.util.*;

public class Jukebox9 {
    public static void main(String[] args) {
        new Jukebox9().go();
    }

    public void go() {
        List<SongV4> songList = MockMoreSongs.getSongsV4();
        System.out.println(songList);

        songList.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
        System.out.println(songList);
        
        Set<SongV4> songSet = new HashSet<>(songList);
        System.out.println(songSet);
    }
}
