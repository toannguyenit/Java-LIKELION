package Day5.Lession.TryCatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchLession {

    static  void readFile() throws FileNotFoundException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            System.out.println("");
            throw new FileNotFoundException();
        }

        catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

}
