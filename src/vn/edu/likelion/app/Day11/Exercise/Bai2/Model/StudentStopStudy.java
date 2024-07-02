package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import java.time.LocalDateTime;

public class StudentStopStudy {
    private String citizenId;
    private String reason;
    private LocalDateTime time;

    public StudentStopStudy() {}

    public StudentStopStudy(String citizenId, String reason, LocalDateTime time) {
        this.citizenId = citizenId;
        this.reason = reason;
        this.time = time;
    }

    public void setCitizenId(String citizenId) {

        this.citizenId = citizenId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
