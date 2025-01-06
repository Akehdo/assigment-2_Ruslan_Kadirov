package Assignment_2.Assignment_2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        if(length > 0){
            for(int i = 0; i < length; i++) {
                int num = scanner.nextInt();
                list.add(num);
            }
        }

        if(length % 2 != 0){
            Collections.sort(list);
        }else{
            Collections.sort(list, Collections.reverseOrder());
        }

        for(int i : list){
            System.out.println(i);
        }
    }
}
