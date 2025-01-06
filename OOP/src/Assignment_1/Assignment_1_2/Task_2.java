package Assignment_1.Assignment_1_2;

import java.util.Scanner; //input class Scanner from java.util

public class Task_2 {
    public static void main(String[] args) {

        //object sc of class Scanner
        Scanner sc = new Scanner(System.in);

        //String "name" variable which we input from keyboard
        String name = sc.nextLine();

        //int age variable which we input from keyboard
        int age = sc.nextInt();

        //condition for check if person need to come to the military registration and enlistment office
        if (age >=18 & age<=28) {
            System.out.println(name + ", come to the military registration and enlistment office");
        }
    }
}
