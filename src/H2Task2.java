public class H2Task2 {
    public static void main(String[] args) {
        /*
        2. Если необходимо, исправьте данный код
         (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
         */
        int[] intArray = {7,15,6,5,2,4,78,65,32};
        try {
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
