public class HTask2 {
    public static void main(String[] args) {
        //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        // и возвращающий новый массив, каждый элемент которого равен разности элементов двух
        // входящих массивов в той же ячейке.
        // Если длины массивов не равны, необходимо как-то оповестить пользователя.

        int [] array1 = new int [] {12,6,56,2,89,45,4};
        int [] array2 = new int [] {10,16,6,23,9,54};

        int [] res_array = sum_arrays(array1,array2);
        for (int i = 0; i < res_array.length; i++) {
            System.out.print(res_array[i]+ " ");
        }
    }

    public static int[] sum_arrays (int [] arr1, int [] arr2){
        int [] res_array = null;
        if (arr1.length != arr2.length){
            throw new RuntimeException("This arrays length not equal");
        }else{
            res_array = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                res_array[i] = arr1[i] + arr2 [i];
            }
        }
        return res_array;
    }
}


