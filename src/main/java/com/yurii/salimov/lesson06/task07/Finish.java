package com.yurii.salimov.lesson06.task07;

import java.math.BigInteger;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Finish implements IFinish {

    private BigInteger result = BigInteger.ONE;

    @Override
    public synchronized void done(final BigInteger result) {
        this.result = this.result.multiply(result);
    }

    public BigInteger getResult() {
        return this.result;
    }
}
