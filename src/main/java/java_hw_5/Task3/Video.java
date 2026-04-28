package java_hw_5.Task3;

public class Video extends Media{

    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void play(){
        System.out.println("Now is playing video: " + "'" + this.getTitle() + "'" + " in " + this.getResolution() + " resolution.");
    }
}
