package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teacher {
    private String id;
    private String name;
    private Set<String> classeIds = new HashSet<>();

    public Teacher(){}

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<String> getClasseIds() {
        return classeIds;
    }

    public void setClasseIds(Set<String> classeIds) {
        this.classeIds = classeIds;
    }
}
