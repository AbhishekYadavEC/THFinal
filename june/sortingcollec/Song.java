package june.sortingcollec;

public class Song implements Comparable<Song>{
    private String name;
    private String singer;
    private Integer year;

    public Song(String name, String singer, Integer year) {
        this.name = name;
        this.singer = singer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Song anotherSong) {
        return this.name.compareTo(anotherSong.name);
//        return (year < anotherSong.getYear())?-1:(this.year > anotherSong.getYear()?1 : 0);
    }
}
