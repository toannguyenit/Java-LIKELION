package vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Interface;

import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.CourseOnline;

import java.util.List;

public interface StudentInterface {
    default void displayDetailCourse(int id, List<CourseOnline> courseOnlines){
        CourseOnline course = new CourseOnline();
        for (CourseOnline courseOnline : courseOnlines) {
            if (courseOnline.getCourseId() == id) {
                course.setCourseId(courseOnline.getCourseId());
                course.setCourseName(courseOnline.getCourseName());
                course.setMentorName(courseOnline.getMentorName());
                course.setCredit(courseOnline.getCredit());
                course.setNetWorkingPlatform(courseOnline.getNetWorkingPlatform());
                course.setCourseDurationDates(courseOnline.getCourseDurationDates());
            }
        }
        if (course == null) {
            System.out.println("Khong tim thay Course");
        }
        else {
            System.out.println("CHI TIET KHOA HOC");
            System.out.println("ID: " + course.getCourseId());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Mentor: " + course.getMentorName());
            System.out.println("Credit: " + course.getCredit());
            System.out.println("NetWorking Platform: " + course.getNetWorkingPlatform());
            System.out.println("Course Duration TimeStamp: " + course.getCourseDurationDates());
        }
    }
}
