package Review;

import java.util.Random;

public class Main {

    static void random(){

        //creating a Random Object ran
        Random ran = new Random();

        //generating a number using nextInt() method
        int randomNumber = ran.nextInt();

        System.out.println("Randomly generated number = " + randomNumber);
    }
    public static void main(String[] args) {

    }
}
