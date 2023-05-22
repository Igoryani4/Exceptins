package Sem_03;

import javax.naming.OperationNotSupportedException;

public class Main {
    public static void main(String[] args) throws OperationNotSupportedException {
        try (Counter counter = new Counter()){
            counter.add();
            counter.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
