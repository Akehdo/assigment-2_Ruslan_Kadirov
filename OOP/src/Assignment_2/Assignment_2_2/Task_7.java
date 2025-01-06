package Assignment_2.Assignment_2_2;

public class Task_7 {
    public static void main(String[] args) {
        signIn("Ruslan");
        signIn("user");
    }

    public static void signIn(String username){
        if (username.equals("user")) {
            return;
        }

        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
