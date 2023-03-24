package cn.bravedawn.design.pattern.behavioral.templatemethod;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 前端课程
 * @date : Created in 2020/11/5 21:31
 */
public class FECourse extends ACourse{

    // 将钩子函数的使用权限开放给应用层
    private boolean needWriteArticleFlag = false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
