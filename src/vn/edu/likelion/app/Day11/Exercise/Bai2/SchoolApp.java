package vn.edu.likelion.app.Day11.Exercise.Bai2;

import vn.edu.likelion.app.Day11.Exercise.Bai2.Model.ClassRoom;
import vn.edu.likelion.app.Day11.Exercise.Bai2.Model.School;
import vn.edu.likelion.app.Day11.Exercise.Bai2.Model.Student;

public class SchoolApp {
    static School school = new School();


    public static void main(String[] args) {
        ClassRoom class01 = new ClassRoom("C01","Lop Java");
        ClassRoom class02 = new ClassRoom("C02","Lop PHP");

        Student student01 = new Student("Trung Kien","BE0001");
        Student student02 = new Student("Song Toan","BE0002");
        Student student03 = new Student("Duc Tan","BE0003");
        Student student04 = new Student("Quoc Thinh","BE0004");

        // Show all


        // Thêm 1 đối tượng
    }
}
