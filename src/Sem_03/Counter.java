package Sem_03;

import javax.naming.OperationNotSupportedException;

public class Counter implements AutoCloseable{

    private int count = 0;
    private boolean is_Close = false;
    public void add() throws OperationNotSupportedException{
        if (is_Close)
            throw new OperationNotSupportedException("Can not use closet resource");
        count++;
    }

    @Override
    public void close() throws OperationNotSupportedException {
        if (is_Close)
            throw new OperationNotSupportedException("Can not use closet resource");
        is_Close = true;
    }
}
