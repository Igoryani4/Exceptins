public class HTask3 {
    public static void main(String[] args) {
        /*
         * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
         * и возвращающий новый массив, каждый элемент которого равен частному элементов
         * двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
         * как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
         * которое пользователь может увидеть - RuntimeException, т.е. ваше.
         */

        int [] array1 = new int[]{12,45,56,8,34,90};
        int [] array2 = new int[]{3,9,8,2,2,0};
        float [] res = divide_arrays(array1,array2);
        print_res(res);

    }

    public static float[] divide_arrays(int[] arr1, int [] arr2){
        float [] res_array = null;
        if (arr1.length != arr2.length){
            throw new RuntimeException("This arrays length not equal");
        }else{
            res_array = new float[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] ==0 || arr2[i] == 0 ){
                    throw new RuntimeException("Divide by zero forbidden");

                }else
                    res_array[i] = arr1[i] / arr2 [i];


            }
        }
        return res_array;
    }
    public static void print_res(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
