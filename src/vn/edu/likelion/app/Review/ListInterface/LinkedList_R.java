package Review.ListInterface;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_R {

    static void linkedListBasic(){
        // Tạo một LinkedList chứa các số nguyên
        LinkedList<Integer> list = new LinkedList<>();

        // Thêm các phần tử vào danh sách
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // In ra danh sách
        System.out.println("Danh sách các phần tử: " + list);
    }

    static void linkedListBasic2(){
        // Tạo một LinkedList chứa các số nguyên
        LinkedList<Integer> list = new LinkedList<>();

        // Thêm các phần tử vào danh sách
        list.add(10);
        list.add(20);
        list.add(30);

        // Thêm phần tử vào đầu danh sách
        list.addFirst(5);

        // Thêm phần tử vào cuối danh sách
        list.addLast(35);

        // In ra danh sách
        System.out.println("Danh sách các phần tử: " + list);
    }

    static void linkedListBasic3(){
        // Tạo một LinkedList chứa các số nguyên
        LinkedList<Integer> list = new LinkedList<>();

        // Thêm các phần tử vào danh sách
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Xóa phần tử từ đầu danh sách
        list.removeFirst();

        // Xóa phần tử từ cuối danh sách
        list.removeLast();

        // In ra danh sách
        System.out.println("Danh sách các phần tử sau khi xóa: " + list);
    }

    static void linkedListBasic4(){
        // Tạo một LinkedList chứa các số nguyên
        LinkedList<Integer> list = new LinkedList<>();

        // Thêm các phần tử vào danh sách
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Truy cập và in ra phần tử đầu tiên
        System.out.println("Phần tử đầu tiên: " + list.getFirst());

        // Truy cập và in ra phần tử cuối cùng
        System.out.println("Phần tử cuối cùng: " + list.getLast());
    }

    static void linkedListBasic5(){

//        Duyệt qua các phần tử trong LinkedList bằng vòng lặp for
        LinkedList<Integer> list = new LinkedList<>();

        // Thêm các phần tử vào danh sách
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Duyệt qua và in ra từng phần tử trong danh sách
        System.out.println("Các phần tử trong danh sách:");
        for (Integer number : list) {
            System.out.println(number);
        }
    }

    static void linkedListBasic6(){
        // Tạo một LinkedList chứa các số nguyên
        LinkedList<Integer> stack = new LinkedList<>();

        // Sử dụng LinkedList như một stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // In ra stack sau khi push
        System.out.println("Stack sau khi push: " + stack);

        // Pop phần tử từ stack
        int poppedElement = stack.pop();

        // In ra phần tử đã pop và stack sau khi pop
        System.out.println("Phần tử đã pop: " + poppedElement);
        System.out.println("Stack sau khi pop: " + stack);
    }

    static void linkedListBasic7(){
        // Tạo một LinkedList chứa các số nguyên
        LinkedList<Integer> queue = new LinkedList<>();

        // Sử dụng LinkedList như một queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // In ra queue sau khi offer
        System.out.println("Queue sau khi offer: " + queue);

        // Poll phần tử từ queue
        int polledElement = queue.poll();

        // In ra phần tử đã poll và queue sau khi poll
        System.out.println("Phần tử đã poll: " + polledElement);
        System.out.println("Queue sau khi poll: " + queue);
    }

    static void linkedListBasic8(){
        // Tạo một LinkedList chứa các số nguyên
        LinkedList<Integer> list = new LinkedList<>();

        // Thêm các phần tử vào danh sách
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Vị trí của phần tử cần lấy (i)
        int i = 2; // Ví dụ lấy phần tử tại vị trí thứ 2 (chỉ số bắt đầu từ 0)

        // Kiểm tra nếu i hợp lệ
        if (i >= 0 && i < list.size()) {
            // Lấy phần tử thứ i
            int element = list.get(i);
            System.out.println("Phần tử thứ " + i + " của LinkedList là: " + element);
        } else {
            System.out.println("Vị trí " + i + " không hợp lệ.");
        }
    }

    static void linkedListBasic9(){
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(10);
//        list.add(0, 20);
//
//        list.set(0,30);
//
//
//        System.out.println(list);

        List<String> linkedList = new LinkedList<>();
        // Thêm phần tử vào danh sách
        linkedList.add("Apple"); linkedList.add("Banana");
        // Thay đổi giá trị của một phần tử
        linkedList.set(1, "Blueberry");
        // Xóa một phần tử
//        linkedList.remove("Apple");
        System.out.println(linkedList);
    }

    public static void main(String[] args) {
        linkedListBasic9();
    }
}
