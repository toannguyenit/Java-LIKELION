package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String id;
    private String name;
    private List<String> students = new ArrayList<>();

    public Class() {}

    public Class(String id, String name, List<String> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }
}
