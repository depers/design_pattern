package cn.bravedawn.design.pattern.behavioral.templatemethod;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 制作课程抽象类
 * @date : Created in 2020/11/5 21:04
 */
public abstract class ACourse {

    // 值得注意的是这里应该加final，这样子类就不能复写该方法了
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("编写手记");
    }

    // 钩子方法
    protected boolean needWriteArticle(){
        return false;
    }

    abstract void packageCourse();


}
