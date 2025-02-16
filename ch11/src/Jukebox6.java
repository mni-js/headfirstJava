import java.util.*;

public class Jukebox6 {
    public static void main(String[] args) {
        new Jukebox6().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        songList.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
        System.out.println("제목 오름차순 정렬:" + songList);

        songList.sort((s1, s2) -> s2.getTitle().compareTo(s1.getTitle()));
        System.out.println("제목 내림차순 정렬:" + songList);

        songList.sort((s1, s2) -> s1.getArtist().compareTo(s2.getArtist()));
        System.out.println("아티스트순 정렬: " + songList);

        songList.sort((s1, s2) -> Integer.valueOf(s1.getBpm()).compareTo(Integer.valueOf(s2.getBpm())));
        System.out.println("bpm순 정렬: " + songList);

    }
}
