package Review.ListInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMap_R {
    static void hashMapBasic(){
        // Tạo một HashMap
        HashMap<String, Integer> people = new HashMap<>();

        // Thêm phần tử vào HashMap
        people.put("Alice", 30);
        people.put("Bob", 25);
        people.put("Charlie", 35);

        // In ra nội dung của HashMap
        System.out.println(people.entrySet());

    }

    static void hashMapBasic2(){
        // Tạo một HashMap
        HashMap<String, Integer> scores = new HashMap<>();

        // Thêm phần tử vào HashMap
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 88);

        // Truy xuất điểm số của một học sinh cụ thể
        int aliceScore = scores.get("Alice");

        // In ra điểm số đó
        System.out.println("Alice's score: " + aliceScore);
    }

    static void hashMapBasic3(){
        // Tạo một HashMap
        HashMap<String, String> emails = new HashMap<>();

        // Thêm phần tử vào HashMap
        emails.put("Alice", "alice@example.com");
        emails.put("Bob", "bob@example.com");
        emails.put("Charlie", "charlie@example.com");

        // Kiểm tra sự tồn tại của một khóa trong HashMap
        String employee = "Alice";
        if (emails.containsKey(employee)) {
            System.out.println(employee + " exists in the HashMap.");
        } else {
            System.out.println(employee + " does not exist in the HashMap.");
        }
    }

    static void hashMapBasic4(){
        // Tạo một HashMap
        HashMap<String, Double> salaries = new HashMap<>();

        // Thêm phần tử vào HashMap
        salaries.put("Alice", 50000.0);
        salaries.put("Bob", 55000.0);
        salaries.put("Charlie", 60000.0);

        // Duyệt qua tất cả các phần tử
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static void hashMapBasic5(){
        // Tạo một HashMap
        HashMap<String, Integer> library = new HashMap<>();

        // Thêm phần tử vào HashMap
        library.put("Book A", 10);
        library.put("Book B", 5);
        library.put("Book C", 7);

        // Cập nhật số lượng sách của một tên sách cụ thể
        library.put("Book A", 12);

        // In ra nội dung của HashMap sau khi cập nhật
        System.out.println(library);
    }

    static void hashMapBasic6(){
        // Tạo một HashMap
        HashMap<String, String> phoneBook = new HashMap<>();

        // Thêm phần tử vào HashMap
        phoneBook.put("Alice", "123-456-7890");
        phoneBook.put("Bob", "234-567-8901");
        phoneBook.put("Charlie", "345-678-9012");

        // Xóa một phần tử khỏi HashMap
        phoneBook.remove("Bob");

        // In ra nội dung của HashMap sau khi xóa
        System.out.println(phoneBook);
    }

    public static void main(String[] args) {
        hashMapBasic2();
    }
}
