import javax.swing.*;
import java.time.LocalDate;
import java.util.*;

public class Main {

    static class Person{
        private LocalDate dateOfBirth;

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }


    private static Map<Integer, Integer> studentCourseMap = new HashMap<Integer, Integer>();
    public static void main(String[] args) {

        Person person =  new Person();
        person.setDateOfBirth(LocalDate.now());

        System.out.println(person.getDateOfBirth());

        person.setDateOfBirth(LocalDate.of(2008, 7, 15));

        System.out.println(person.getDateOfBirth());


//
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//
//        date.withYear(2025);
//
//        System.out.println(date);

    }
}
