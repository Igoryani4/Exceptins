public class Sem01 {
    public static void main(String[] args) {
        int [] array = new int []{1,2,4,5,6,7,8,50};
        int num = 5;
        int res = exception(array,num);
        ExceptionMessage(res);

    }

    public static int exception(int [] array, int num){
        int  index = 0;

        if (array == null){
            return -3;
        }

        if (array.length > 15){
            return -1;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == num){
                index = i;
                return index;
            }
        }
        return -2;
    }

    public static void ExceptionMessage(int exp){
        if (exp == -1) {
            System.out.println("Length is large 5");
            return;
        }
        if (exp == -2) {
            System.out.println("number is not array");
            return;
        }
        if (exp == -3){
            System.out.println("array is null");
            return;
        }

        else System.out.println("find number index is : " + exp);
    }
}
