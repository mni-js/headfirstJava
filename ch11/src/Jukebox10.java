import java.util.*;

public class Jukebox10 {
    public static void main(String[] args) {
        new Jukebox10().go();
    }

    public void go() {
        List<SongV4> songList = MockMoreSongs.getSongsV4();
        System.out.println(songList);

        songList.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
        System.out.println(songList);
        
        Set<SongV4> songSet = new TreeSet<>(songList);
        System.out.println(songSet);

        Set<SongV4> songSet2 = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
        songSet2.addAll(songList);
        System.out.println(songSet2);
    }
}
