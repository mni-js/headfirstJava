import java.util.*;

public class Jukebox2 {
    public static void main(String[] args) {
        new Jukebox2().go();
    }

    public void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);

        // Collections.sort(songList); // 에러 발생: songList가 Comparable 인터페이스를 구현하지 않아서 
        System.out.println(songList);
    }
}