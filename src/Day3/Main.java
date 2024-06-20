package Day3;

import Day3.Lib.Sport;

public class Main {
    static abstract class Assembly{
        String name;
        String type;
        public void showOrgization(){
            System.out.println("Name: " + name);
        }
        public abstract void showOrgizationType();
    }

    static class Employee extends Assembly{

        @Override
        public void showOrgizationType() {
            System.out.println("Employee Type: " + type);
        }
    }



    public static void main(String[] args) {


    }
}
