package org.centrale.medev_ds;

public class PreparationDS {   
    public static float divideNumbers(int x, int y) throws DivisionByZeroException {
        if (y == 0) {
            throw new DivisionByZeroException("Division by zero not allowed");
        }
        float res = (float)x / y;
        return res;
    }
}