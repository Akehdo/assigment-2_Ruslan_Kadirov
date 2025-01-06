package Assignment_1.Assignment_1_2;

import java.util.Scanner; //import class Scanner from java.util

public class Task_1 {
    public static void main(String[] args) {
        // sc = object of class Scanner
        Scanner sc = new Scanner(System.in);

        //double variable which need input from keyboard
        double temperature = sc.nextDouble();

        //condition for check is temperature cold or warm
        if(temperature>0){
            System.out.println("Its cold outside");
        }else{
            System.out.println("Its warm outside");
        }
    }
}
