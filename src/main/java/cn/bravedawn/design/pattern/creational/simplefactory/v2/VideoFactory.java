package cn.bravedawn.design.pattern.creational.simplefactory.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 视频工厂
 * @date : Created in 2020/9/13 16:00
 */
public class VideoFactory {

    /**
     * 1. 工厂类的职责相对过重，增加新的产品需要修改工厂类的判断逻辑，违背开闭原则
     * 2. 如果这个方法不需要继承和重写，这个方法也可以是static的。因为static方法是不能被重写的
     */
    public Video getVideo(String type){
        if ("Java".equalsIgnoreCase(type)){
            return new JavaVideo();
        } else if("Python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 通过抽象工厂方法弥补简单工厂违背开闭原则的缺点
     * @param c
     * @return
     */
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
