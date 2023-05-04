import java.util.Scanner;

public class H2Task1 {
    public static void main(String[] args) {
        /*
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        и возвращает введенное значение. Ввод текста вместо числа не должно приводить
        к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
         */
        System.out.println(return_input_float_number());
    }

    public static float return_input_float_number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number to format 0,00");
        String num = sc.nextLine();
        if(isNumeric(num)){
            return Float.parseFloat(num);
        }else{
            while (! isNumeric(num)){
                System.out.println("You input not type FLOAT, please try again");
                num = sc.nextLine();
            }
        }
        return Float.parseFloat(num);
    }

    public static boolean isNumeric(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
