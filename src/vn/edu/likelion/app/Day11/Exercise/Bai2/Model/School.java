package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import java.util.ArrayList;
import java.util.List;

public class School {
    private static List<Student> students = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<ClassRogit om> classes = new ArrayList<>();
    private static List<StudentStopStudy> studentStopStudies = new ArrayList<>();

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        School.students = students;
    }

    public static List<Teacher> getTeachers() {
        return teachers;
    }

    public static void setTeachers(List<Teacher> teachers) {
        School.teachers = teachers;
    }

    public static List<ClassRoom> getClasses() {
        return classes;
    }

    public static void setClasses(List<ClassRoom> classes) {
        School.classes = classes;
    }

    public static List<StudentStopStudy> getStudentStopStudies() {
        return studentStopStudies;
    }

    public static void setStudentStopStudies(List<StudentStopStudy> studentStopStudies) {
        School.studentStopStudies = studentStopStudies;
    }
}
