package Total_home_project;

import java.util.Objects;
import java.util.Scanner;

public class Total_project {
    public static void main(String[] args) {
        Total_project tp = new Total_project();
        String [] data_person_string = new String[]{"first name", "last name", "patronymic",
                "date of birth to format XX.XX.XXXX","phone number to format 89992223311", "gender to format 'f/m'"};
        String [] input_person_data_string = new String[data_person_string.length];
        for (int i = 0; i < data_person_string.length; i++) {
            if (i == 3){
                String text = input_String(data_person_string[i]);
                if (check_date(text)){
                    input_person_data_string[i] = text;
                }else {
                    while (check_date(text)){
                        text = input_String(data_person_string[i]);
                    }
                }

//                if (check_format_date(input_String(data_person_string[i]), data_person_string[i])){
//                    input_person_data_string[i] = input_String(data_person_string[i]);
            }
            input_person_data_string[i] = input_String(data_person_string[i]);
        }
        print(input_person_data_string);
    }
    public static String input_String(String text){
        String input_text = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input " + text + " :");
        try {
            input_text = sc.nextLine();
        }
        catch (Exception e){
            e.printStackTrace();
//            throw new NullPointerException("String input is null");
        }
        if (input_text.equals("")) {
            while (input_text.equals("")){
                System.out.println("ERROR, String not maybe null!");
                System.out.println("You nothing input, please try again!");
                System.out.println("Please input " + text + " :");
                input_text = sc.nextLine();
            }
        }

        return input_text;
    }

    public static void print (String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public boolean is_phone_number (String tel){
        String [] tel_arr = tel.split("");
        if (tel_arr.length != 11){
            throw new RuntimeException("number length not is 11");
        }else {
            if (!tel_arr[0].equals("+")){
                throw new RuntimeException("need symbol '+'");
            }
        }
        return  true;
    }

//    public static String check_format_date(String text_data){
//        String date2 = input_String(text_data);
//        String [] dt = date2.split("");
//        if (dt.length != 10) {
//            System.out.println("the length of the phone should be 10 digits");
//            while (date2.length() != 10){
//                date2 = input_String(text_data);
//                dt = date2.split("");
//            }
//
//        }
//        if (!Objects.equals(dt[2], ".") && !Objects.equals(dt[5], ".")){
//            while (true){
//                System.out.println("You input not write format date");
//                date2 = input_String(text_data);
//                dt = date2.split("");
//            }
//        }
//        return date2;
//    }

    public static boolean check_date (String date){
        if (date.length() != 11){
            return false;
//            while (date.length() != 10){
//                Scanner sc2 = new Scanner(System.in);
//                System.out.println("the length of the phone should be 10 digits");
//                date = sc2.nextLine();
//            }
        }
        String [] date1 = date.split(".");
        if (check_format_date(date)){
            if (Integer.parseInt(date1[1]) > 31){
                System.out.println("there are only 31 days in a month");
                return false;
            }
            if (Integer.parseInt(date1[2]) > 12){
                System.out.println("there are only 12 months a year");
                return false;
            }
            if (Integer.parseInt(date1[3]) > 2013){
                System.out.println("you are only 10 years old you are a minor");
                return false;
            }

        }
        return true;
    }
    public static boolean check_format_date(String date){
        String [] dt = date.split("");
        if (!Objects.equals(dt[2], ".") && !Objects.equals(dt[5], ".")){
            return false;
//            while (!Objects.equals(dt[2], ".") && !Objects.equals(dt[5], ".")){
//                Scanner sc2 = new Scanner(System.in);
//                System.out.println("You input not write format date");
//                System.out.println(" input date of birth to format XX.XX.XXXX");
//                date = sc2.nextLine();
//            }
        }
        return true;
    }
}
