package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import java.time.LocalDate;
import java.util.UUID;

public class Student {
    private String id = "";
    private String name;
    private String citizenId;

    public Student() {
    }

    public Student(String name,String citizenId) {
        this.name = name;
        this.citizenId = citizenId;
    }

    public String getStudentId() {
        return id;
    }

    public void setStudentId(String studentId) {
        this.id = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    private String getUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "").substring(0, 8);
    }
}
