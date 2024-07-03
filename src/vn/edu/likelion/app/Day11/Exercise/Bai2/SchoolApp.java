package vn.edu.likelion.app.Day11.Exercise.Bai2;

import vn.edu.likelion.app.Day11.Exercise.Bai2.Model.*;

import java.time.LocalDate;

public class SchoolApp {
    static School school = new School();


    public static void main(String[] args) {

        // Trường có 3 lớp và 3 giáo viên
        // Thêm danh sách lớp học
        System.out.println("""
                Test case: Trường có 3 lớp và 3 giáo viên Start
                """);
        ClassRoom class01 = new ClassRoom("C01","Lop Java");
        ClassRoom class02 = new ClassRoom("C02","Lop PHP");
        ClassRoom class03 = new ClassRoom("C03","Lop Python");
        ClassRoom class04 = new ClassRoom("C04","Lop JS");
        school.insertClassRoom(class01); // Thêm lớp thành công
        school.insertClassRoom(class02); // Thêm lớp thành công
        school.insertClassRoom(class03); // Thêm lớp thành công
        school.insertClassRoom(class04); // Lỗi vì quá số lớp

        Teacher teacher1 =  new Teacher("T01", "Tuan Mentor");
        Teacher teacher2 =  new Teacher("T02", "Duong Mentor");
        Teacher teacher3 =  new Teacher("T03", "Phuc Mentor");
        Teacher teacher4 =  new Teacher("T04", "Minh Mentor");
        school.insertTeacher(teacher1);// Thêm giáo viên thành công
        school.insertTeacher(teacher2);// Thêm giáo viên thành công
        school.insertTeacher(teacher3);// Thêm giáo viên thành công
        school.insertTeacher(teacher4);// Lỗi vì quá số giáo viên
        System.out.println("""
                Test case: Trường có 3 lớp và 3 giáo viên End
                ============================================
                """);

        // mỗi giáo viên dạy 2 lớp,

        // cần xem được danh sách học viên của mỗi giáo viên,


        // Học viên cần đăng ký đầy đủ các thông tin sau để được vào lớp: Tên, ngày tháng năm sinh, CCCD
        Student student01 = new Student("Trung Kien","BE0001", LocalDate.of(2000, 7, 15));
        Student student02 = new Student("Song Toan","BE0002", LocalDate.of(1996, 7, 15));
        Student student03 = new Student("Duc Tan","BE0003", LocalDate.of(1998, 7, 15));
        Student student04 = new Student("Quoc Thinh","BE0004", LocalDate.of(2003, 7, 15));

        // Lớp học có thể sắp xếp tối đa 10 bàn
        // Từ  18-20 tuổi mới được đăng ký học
        // Học viên nào đăng ký thành công sẽ nhận đc mã học viên
        class01.insert(student01); // Thêm thất bại vì tuổi
        class01.insert(student02); // Thêm thất bại vì tuổi
        class01.insert(student03); // Thêm thất bại vì tuổi
        class01.insert(student04); // Thêm thành công và được cập nhật Mã Học viên
        System.out.println(student04.toString());

        // Cần xem được danh sách các học viên trong lớp và thông tin chi tiết của họ

        // Khi đủ học viên thì lớp mới bắt đầu, học viên sẽ được tính ngày giờ nhập học kể từ lúc lớp học bắt đầu


        // Một số học viên đọc sai thông tin, cần sửa lại được thông tin của học viên
        student02.setName("Nguyen Vo Song Toan");
        school.updateStudent(student02);

        // Trong thời gian học, có 1 số bạn bỏ học, cần lưu lại danh sách những bạn đó và lý do bỏ học
        school.insertStudentStopStudy(new StudentStopStudy(student03.getCitizenId(), "Chan hoc", LocalDate.now()));
    }
}
