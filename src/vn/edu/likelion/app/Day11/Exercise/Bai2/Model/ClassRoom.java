package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import java.util.HashSet;
import java.util.Set;

public class ClassRoom {
    private String id;
    private String name;
    private Set<String> studentIds = new HashSet<>();

    public ClassRoom() {}

    public ClassRoom(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClassRoom(String id, String name, Set<String> studentIds) {
        this.id = id;
        this.name = name;
        this.studentIds = studentIds;
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

    public Set<String> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(Set<String> studentIds) {
        this.studentIds = studentIds;
    }
}
