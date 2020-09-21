package cn.bravedawn.design.pattern.creational.builder.v2;

import org.apache.commons.lang3.StringUtils;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程类，链式调用
 * @date : Created in 2020/9/21 20:10
 */
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    /**
     * question & answer
     */
    private String courseQA;

    private Course(CourseBuilder builder){
        this.courseArticle = builder.courseArticle;
        this.courseName = builder.courseName;
        this.coursePPT = builder.coursePPT;
        this.courseVideo = builder.courseVideo;
        this.courseQA = builder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        /**
         * question & answer，设置默认值
         */
        private String courseQA = "qa";

        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }


}
