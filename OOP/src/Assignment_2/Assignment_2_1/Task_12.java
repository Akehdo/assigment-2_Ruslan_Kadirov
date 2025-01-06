package Assignment_2.Assignment_2_1;

public class Task_12 {
    public static int[][] array;
    public static void main(String[] args) {
        array = new int[2][3];
        for(int i = 0 ; i < array.length; i++){
            for(int k = 0 ; k < array[i].length; k++){
                array[i][k] = 2;
                System.out.print(array[i][k]+ " ");
            }
            System.out.println();
        }
    }
}
