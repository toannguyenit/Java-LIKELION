package vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model;

import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Interface.ClassRoomInterface;

import java.util.List;

public class ClassRoom implements ClassRoomInterface {
    private static List<Student> students;
    private static List<CourseOnline> courseOnlines;

    public ClassRoom() {
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        ClassRoom.students = students;
    }

    public static List<CourseOnline> getCourseOnlines() {
        return courseOnlines;
    }

    public static void setCourseOnlines(List<CourseOnline> courseOnlines) {
        ClassRoom.courseOnlines = courseOnlines;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public void editStudent(Student student) {

    }

    @Override
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void displayStudent(int studentId) {

    }

    @Override
    public void addCourse(CourseOnline course) {
        courseOnlines.add(new CourseOnline());
    }

    @Override
    public void removeCourse(CourseOnline course) {
    courseOnlines.remove(course);
    }

    @Override
    public void editCourse(CourseOnline course) {

    }

    @Override
    public void displayCourses() {
        for (CourseOnline course : courseOnlines) {
            System.out.println(course.toString());
        }
    }

    @Override
    public void displayDetailCourse(int courseId) {
        for (CourseOnline course : courseOnlines) {
            if (course.getCourseId() == courseId) {
                System.out.println(course.toString());
            }
        }
    }
}
