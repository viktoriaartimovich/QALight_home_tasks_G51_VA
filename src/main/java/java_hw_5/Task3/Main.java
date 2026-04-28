package java_hw_5.Task3;

public class Main {
    public static void main(String[] args) {
        Music music = new Music("Symphony No.7",40, "Ludwig van Beethoven");
        Video video = new Video("Cartoon",30,"1920x1080");

        music.play();
        video.play();
    }
}
