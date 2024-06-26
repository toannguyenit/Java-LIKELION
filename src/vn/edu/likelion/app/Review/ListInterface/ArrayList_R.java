package Review.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_R {
    static void arrayListBasic() {
        // Tim giá trị lớn nhất
        ArrayList<Integer> list = new ArrayList<>();
        // Thêm phần tử vào danh sách
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);
        // In các phần tử trong danh sách
        for (Integer num : list) {
            System.out.println(num);
        }

        // Xóa phần tử tại chỉ số 2 (phần tử thứ 3)
        list.remove(2);

        // Tìm giá trị lớn nhất
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("Giá trị lớn nhất là: " + max);
    }

    static void arrayListSort() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);

        // Sắp xếp danh sách
        Collections.sort(numbers);

        // In danh sách đã sắp xếp
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    static void arrayListSortReverse() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);

        // Sắp xếp danh sách theo thứ tự giảm dần
        Collections.sort(numbers, Comparator.reverseOrder());

        // In danh sách đã sắp xếp
        for (int number : numbers) {
            System.out.println(number);
        }
    }


    public static void main(String[] args) {
        arrayListSortReverse();

    }
}
