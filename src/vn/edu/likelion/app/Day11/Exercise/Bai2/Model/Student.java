package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import java.time.LocalDate;
import java.util.UUID;

public class Student {
    private String id = "";
    private String name;
    private LocalDate birthday;
    private String citizenId;

    public Student() {
    }

    public Student(String name, LocalDate birthday, String citizenId) {
        this.name = name;
        this.birthday = birthday;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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
