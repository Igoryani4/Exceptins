import java.util.Objects;

public class Htask1 {
    public static void main(String[] args) {
        //Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    }

    public void divide_by_zero(int a, int b){
        if (a == 0 || b == 0){
            throw new RuntimeException("Not divide by zero");
        }else{
            int c  = a + b;
        }
    }

    public void text_is_null(String text){
        if (Objects.equals(text, "") || text == null){
            throw new RuntimeException("String not may be null");
        }
    }

    public void is_phone_number (String tel){
        String [] tel_arr = tel.split("");
        if (tel_arr.length == 12){
            throw new RuntimeException("number length not is 12");
        }else {
            if (!tel_arr[0].equals("+")){
                throw new RuntimeException("need symbol '+'");
            }
        }
    }
}
