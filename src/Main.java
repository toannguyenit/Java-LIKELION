import javax.swing.*;
import java.util.*;

public class Main {


    private static Map<Integer, Integer> studentCourseMap = new HashMap<Integer, Integer>();
    public static void main(String[] args) {
        // Ví dụ thêm dữ liệu vào Map
        studentCourseMap.put(1, 101);
        studentCourseMap.put(2, 102);
        studentCourseMap.put(3, 103);
        studentCourseMap.put(4, 104);

        // Tạo danh sách để lưu courseId
        List<Integer> courseIds = new ArrayList<Integer>();

        // Lặp qua từng phần tử trong Map để lấy courseId
        for (Map.Entry<Integer, Integer> entry : studentCourseMap.entrySet()) {
            courseIds.add(entry.getValue());
        }

        // In ra danh sách courseId
        System.out.println("Danh sách courseId: " + courseIds);


    }
}
