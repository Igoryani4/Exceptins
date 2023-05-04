import java.io.FileNotFoundException;

public class H2Task3 {
    public static void main(String[] args) throws Exception {
        /*
        Дан следующий код, исправьте его там,где требуется
        (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
         */
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");

        }
    }

    private static void printSum ( int i, int i1) throws FileNotFoundException {
        System.out.println(i + i1);
    }

}
