package vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Interface;

import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.CourseOnline;
import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.Student;

public interface ClassRoomInterface {
    void addStudent(Student student);
    void removeStudent(Student student);
    void editStudent(Student student);
    void displayStudents();
    void displayStudent(int studentId);

    void addCourse(CourseOnline courseOnline);
    void removeCourse(CourseOnline courseOnline);
    void editCourse(CourseOnline courseOnline);
    void displayCourses();
    void displayDetailCourse(int courseId);
}
