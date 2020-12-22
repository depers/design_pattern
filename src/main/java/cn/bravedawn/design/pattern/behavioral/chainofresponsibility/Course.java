package cn.bravedawn.design.pattern.behavioral.chainofresponsibility;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程
 * @date : Created in 2020/12/22 19:49
 */
public class Course {

    private String name;
    private String artilce;
    private String video;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtilce() {
        return artilce;
    }

    public void setArtilce(String artilce) {
        this.artilce = artilce;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", artilce='" + artilce + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
