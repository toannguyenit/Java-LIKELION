package vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model;

import java.util.HashMap;
import java.util.Map;

public class StudentCourse {
    private static Map<Integer, Integer> studentMap = new HashMap<Integer, Integer>();

    public StudentCourse() {
    }

    public static Map<Integer, Integer> getStudentMap() {
        return studentMap;
    }

    public static void setStudentMap(Map<Integer, Integer> studentMap) {
        StudentCourse.studentMap = studentMap;
    }
}
