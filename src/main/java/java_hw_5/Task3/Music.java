package java_hw_5.Task3;

public class Music extends Media {

    private String artist;

    public Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void play(){
        System.out.println("Media is playing now of an artist: " + this.getArtist() + " - " + this.getTitle());
    }
}
