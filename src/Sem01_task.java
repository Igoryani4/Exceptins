public class Sem01_task {
    public static void main(String[] args) {

        int [][] array = new int[][]{{1,0,1},{1,1,0},{1,1,0}};
        System.out.println(sum(array));

    }
    public static int sum(int[][] array){
        int sum_array = 0;
        if (check_quarter(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != 0 && array[i][j] != 1){
                        throw  new RuntimeException("number in array is not 0 or 1.");
                    }else {
                        sum_array += array[i][j];
                    }
                }
            }
        }
        return sum_array;
    }

    public static boolean check_quarter(int[][] arr){
        for (int i = 0; i < arr.length -1; i++) {
            if (arr.length != arr[i].length){
                throw new RuntimeException("It is not quarter array");
            }
        }
        return true;
    }
}
