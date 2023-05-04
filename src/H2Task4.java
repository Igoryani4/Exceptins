import java.util.Objects;
import java.util.Scanner;

public class H2Task4 {
    public static void main(String[] args) {
        String text;

        /*
        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
         */
        input_data();
    }

    public static void input_data() {

        if (is_empty(input())){
            try {
                System.out.println("CORRECT");
            } catch (NullPointerException e) {
                System.out.println("You nothing input, try again");
            }
        }else while (!is_empty(input()));
    }

    public static boolean is_empty(String text){
        if(Objects.equals(text, "")) {
            System.out.println("You nothing input, try again");
            return false;
        }
        return true;
    }


    public static String input (){
        Scanner sc1 = new Scanner(System.in);
        System.out.println();
        System.out.print("input text : ");
        return sc1.nextLine();
    }
}


