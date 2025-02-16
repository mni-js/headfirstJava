import java.util.*;

class TitleCompare implements Comparator<SongV3> {
    public int compare(SongV3 s1, SongV3 s2) {
        return s1.getTitle().compareTo(s2.getTitle());
    }
}
