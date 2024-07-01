package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.Course;

import java.util.ArrayList;
import java.util.List;

public class School {
    private static List<Student> students = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Class> classes = new ArrayList<>();

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

    public static List<Class> getClasses() {
        return classes;
    }

    public static void setClasses(List<Class> classes) {
        School.classes = classes;
    }
}
