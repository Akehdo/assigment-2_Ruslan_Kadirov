package Assignment_1.Assignment_1_2;

public class Task_8 {
    public static void main(String[] args) {
        int sum = 0; //variable for sum of numbers
        int number = 1;

        //loop for sum
        while(number <= 100) {
            //condition to check that number is not a divider of 3
            if (number % 3 == 0) {
                number++;//increment
                continue; //skip number if the condition true
            }

            sum += number; //shortcut like sum = sum + number
            number++; //increment
        }
        System.out.println(sum);
    }
}
