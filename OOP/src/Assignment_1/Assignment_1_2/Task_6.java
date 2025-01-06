package Assignment_1.Assignment_1_2;

import java.util.Objects;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        //object scanner of class Scanner
        Scanner scanner = new Scanner(System.in);

        int sum = 0; //int variable for summing

        //infinity loop for counting sum
        while(true){
            String input = scanner.nextLine(); // inputing values

            //conditiob to quit the infinity loop
            if(input.equals("ENTER")){
                break;
            }

            sum += Integer.parseInt(input); //we are parsing String variable to a int type for calculations
        }

        System.out.println(sum); //output sum
    }
}
